package com.how2java.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Message;
import com.how2java.service.MessageService;
import com.how2java.service.UserService;

@Controller
@RequestMapping("")
public class MessageController {
	@Autowired
	MessageService mess;
	@Autowired
	UserService userService;
	 @RequestMapping(value = "/message", method = RequestMethod.GET)
	   public ModelAndView User(@RequestParam int userid) {
		 ModelAndView a= new ModelAndView("message", "command", new com.how2java.pojo.Message());
		com.how2java.pojo.User c=userService.byid(userid);
		a.addObject("name",c.getUsername());
		a.addObject("id", userid);
		 //按照ID找他的私信
		List<Message> messs= mess.selectAllmessageByid(userid);
		 a.addObject("list", messs);
	      return a;
	   }
	
	
	//提交私信
	 @RequestMapping(value = "xiexin", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")com.how2java.pojo.Message me, 
	   ModelMap model,MultipartFile fileimg,HttpSession session) throws Exception{
	      
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
		 me.setImage(path);
			int j=mess.insertMessage(me);
			if(j>0){
				System.out.println("cg");
			}
	      
			  model.addAttribute("id", me.getFaUserID());
              return "redirect:/message";
	   }

	 @RequestMapping("sendUserName.action")
	 @ResponseBody
	 public String userone(HttpServletRequest request,com.how2java.pojo.User user){
			if(userService.findUserByUserName(user.getUsername())>0 ){
 				request.getSession().setAttribute("usernameMsg", "用户名已存在！");
 				return "error";
 			}
		return "success";
	 }
	
	 @RequestMapping("sendIdCode.action")
	 	public void AjaxSendIdCode(String email, HttpServletResponse response,HttpServletRequest request) 
	                 throws IOException, AddressException, MessagingException{
	 		PrintWriter out = response.getWriter();
	 		response.setCharacterEncoding("utf-8");
	 		int idcode = (int) (Math.random()*100000);
	 		String text = Integer.toString(idcode);
	 		request.getSession().setAttribute("idcode", text);
	 		MailUtil mailUtil = new MailUtil();
	 		mailUtil.sendMail(email, text);
	                 out.write("error");
	 	}
	 
	 @RequestMapping("regist.action")
	 	public String regist(com.how2java.pojo.User user, String idcode,HttpServletRequest request){
	 		if(user.getUsername()!= null){
	 			if(!request.getSession().getAttribute("idcode").equals(idcode)){
	 				
	 				request.getSession().setAttribute("idcodeMsg", "验证码错误！");
	 				return "regist";
	 			}

	 			if(userService.emailone(user.getEmail())>0){
	 				request.getSession().setAttribute("idcodeMsg", "邮箱已经被注册");
	 				return "regist";
	 			}
	 			System.out.println(idcode);
	 			userService.insertUser(user);
	 			return "login";
	 		}else{
	 			return "regist";
	 		}
	 	}
	  
	 


}
