package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Message;
import com.how2java.service.MessageService;

@Controller
@RequestMapping("")
public class MessageController {
	@Autowired
	MessageService mess;
	
	 @RequestMapping(value = "/message", method = RequestMethod.GET)
	   public ModelAndView User() {
		 ModelAndView a= new ModelAndView("message", "command", new com.how2java.pojo.Message());
		 a.addObject("name", "张三");
		 //按照ID找他的私信
		List<Message> messs= mess.selectAllmessageByid(2);
		 a.addObject("list", messs);
	      return a;
	   }
	
	
	//提交私信
	 @RequestMapping(value = "xiexin", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")com.how2java.pojo.Message me, 
	   ModelMap model) {
	      model.addAttribute("faid", me.getFaUserID());
	      model.addAttribute("jieid", me.getJieUserID());
	      model.addAttribute("text", me.getText());

	      
			int j=mess.insertMessage(me);
			if(j>0){
				System.out.println("cg");
			}
	      
	      return "result";
	   }


}
