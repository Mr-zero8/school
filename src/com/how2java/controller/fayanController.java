package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.how2java.pojo.User;
import com.how2java.pojo.fayan;
import com.how2java.service.UserService;
import com.how2java.service.fayanService;

@Controller
@RequestMapping("")
//Controller之间的转跳并传值
public class fayanController {

	@Autowired
	fayanService fayan1;
	@Autowired
	UserService us;
	
	@RequestMapping("/zhojian")
	public String chuangdi(ModelMap model){
		
		model.addAttribute("faid","faid");
		model.addAttribute("jieid", "jieid");
		model.addAttribute("text", "text");
		return"forward:/createOrder";
	}
	
	@RequestMapping(value ="/createOrder")
    public String createOrder(ModelMap model) {

    return"result";

    }
	@RequestMapping(value ="/fayan")
	public String selectALLfayan(ModelMap model){
		List<fayan> a=fayan1.selectALLfayan();
		model.addAttribute("fayanlist", a);

		return "jinyan";
	}
	@RequestMapping(value ="/jinyan")
	public String reported(ModelMap model,@RequestParam int id){

		List<fayan> a=fayan1.selectALLfayan();
		model.addAttribute("fayanlist", a);
		fayan1.jubao(id);
		
		return "jinyan";
	}
}
