package com.how2java.controller;



import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.pojo.User;
import com.how2java.service.CategoryService;
import com.how2java.service.UserService;
import com.how2java.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("login1")
	public String login(@RequestParam String username,@RequestParam String password,Model model){
		
		System.out.println("用户登录："+username+password);
		
		/*Map<String, String> map=new LinkedHashMap<String,String>();
		
		map.put("name", user.getName());
		map.put("password", user.getPassword());*/
		User a=userService.login(username,password);
		System.out.println(a);
		if(a.getStudentid()==1){
			model.addAttribute("who", "学生用户");
			return "success";
		}
		
		return "login1";
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


	    session.setAttribute("filename", filename);
	        session.setAttribute("user", user);
	        return "success";


	}


}
