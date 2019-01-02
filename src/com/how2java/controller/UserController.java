package com.how2java.controller;



import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.pojo.TalkDetail;
import com.how2java.pojo.User;
import com.how2java.pojo.userlike;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkDetailService;
import com.how2java.service.TalkService;
import com.how2java.service.UserService;
import com.how2java.service.userlikeService;
import com.how2java.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class UserController {
	//获得Session
	public static HttpSession getSession() { 
	    HttpSession session = null; 
	    try { 
	        session = getRequest().getSession(); 
	    } catch (Exception e) {} 
	        return session; 
	} 
	    
	public static HttpServletRequest getRequest() { 
	    ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
	    return attrs.getRequest(); 
	}
	@Autowired
	TalkDetailService talkDetailService;

	@Autowired
	SchoolbaService schoolbaService;
	
	@Autowired
	UserService userService;
	@Autowired
	userlikeService like;
	@Autowired
	TalkService talkone;

	
	@RequestMapping("login")
	public String login(@RequestParam String username,@RequestParam String password,Model model){
		
		System.out.println("用户登录："+username+password);
		
		/*Map<String, String> map=new LinkedHashMap<String,String>();
		
		map.put("name", user.getName());
		map.put("password", user.getPassword());*/
		User a=userService.login(username,password);
		int aa=userService.shifou(username, password);
		HttpSession session = getSession();
		if(aa>0){
			System.out.println(a);
			model.addAttribute("user", a);
			session.setAttribute("msg","登录成功");
			return "login";
		}
		
		session.setAttribute("msg","登录失败");
		
		return "login";
	}



	@RequestMapping("/register1")
	public String doRegister(String username,String password,MultipartFile fileimg,HttpSession session)
	        throws Exception{
	    System.out.println("username="+username+"  password="+password);
	    String path="";
	    String filename=null;
	    if(!fileimg.isEmpty()){
	        // 上传的文件路径  建在WebRoot目录下--fileupload
	        path = session.getServletContext().getRealPath("/fileupload/");
	        // 上传文件名
	         filename = fileimg.getOriginalFilename();

	        System.out.println(filename);
	        System.out.println(path);
	        // 做一个判断 图片扩展名   substring(int index) 返回一个以index为索引作为起点的含头不含尾的后面的字符串 
	        String types = filename.substring(filename.lastIndexOf(".")+1).toLowerCase();

	        // 如果有需求是要修改上传的图片的名字为用户id开头的
	        //String newfilename = account+filename.substring(filename.lastIndexOf(".")); // 取得的是 .jpg

	        File filepath = new File(path,filename);
	        // 判断路径是否存在，不存在就创建一个
	        if(!filepath.getParentFile().exists()){
	            filepath.getParentFile().mkdirs();
	        }
	        fileimg.transferTo(new File(path + File.separator + filename)); // 会上传到服务器中的路径
	    }
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword(password);
	    path=path+filename;
	    userService.addImage(path,1);
	    //user.setFilepath(path);


	    User a=userService.login(username, password);
	    
	    session.setAttribute("filename", filename);
	        session.setAttribute("user", user);
	        if(a.getId()>0){
	        return "success";
	        }
	        return "";
	}

	@RequestMapping("/personal")
	public String personal(@RequestParam int userid,Model model){
		User a=userService.byid(userid);
		System.out.println(a);
		HttpSession session = getSession();
		
		session.setAttribute("msg","请先登录");
		model.addAttribute("user",a);
		if(userid==0){
			return "login";
		}
		if(a.getSchoolid()==1){
			return "schoolPersonalcenter";
		}else if(a.getStudentid()==1){
			return "stuPersonalcenter";
		}else{
			return "managerPersonalcenter";
		}
	}

	@RequestMapping("/xiutouxiang")
	public String xiutouxiang( ModelMap model,MultipartFile fileimg,HttpSession session,@RequestParam int id) throws IllegalStateException, IOException{
		String path="";
	    String filename=null;
	    if(!fileimg.isEmpty()){
	        // 上传的文件路径  建在WebRoot目录下--fileupload
	        path = session.getServletContext().getRealPath("/fileupload/");
	        // 上传文件名
	         filename = fileimg.getOriginalFilename();

	        System.out.println(filename);
	        System.out.println(path);
	        // 做一个判断 图片扩展名   substring(int index) 返回一个以index为索引作为起点的含头不含尾的后面的字符串 
	        String types = filename.substring(filename.lastIndexOf(".")+1).toLowerCase();

	        // 如果有需求是要修改上传的图片的名字为用户id开头的
	        //String newfilename = account+filename.substring(filename.lastIndexOf(".")); // 取得的是 .jpg

	        File filepath = new File(path,filename);
	        // 判断路径是否存在，不存在就创建一个
	        if(!filepath.getParentFile().exists()){
	            filepath.getParentFile().mkdirs();
	        }
	        fileimg.transferTo(new File(path + File.separator + filename)); // 会上传到服务器中的路径
	    }
	 
	 
	 
	    path=path+filename;
	    userService.addImage(path, id);
	    
		User a=userService.byid(id);
		//List<userlike> likes=like.likewhat(id);
		System.out.println(a);
		model.addAttribute("user",a);
		//model.addAttribute("likes",likes);
		if(a.getSchoolid()==1){
			return "schoolPersonalcenter";
		}else if(a.getStudentid()==1){
			return "stuPersonalcenter";
		}else{
			return "managerPersonalcenter";
		}
		}
	@RequestMapping("/tie")
	public String like(Model model,int userid){
		List<userlike> likes=like.likewhat(userid);
		model.addAttribute("likes",likes);
		return "tie";
	}
	//展示我的收藏
	@RequestMapping("/shouchang")
	public String shouchang(Model model,int id){
		List<userlike> likes=like.likewhat(id);
		model.addAttribute("likes",likes);
		return "tie";
	}
/*	//完成收藏行为
	@RequestMapping("/shouchangING")
	public String shouchangING(Model model,int userid,int talkid,int schoolid){
System.out.println(userid);
		return "tie";
	}*/
	
}
