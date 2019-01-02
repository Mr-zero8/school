package com.how2java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Message;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.service.MessageService;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkDetailService;
import com.how2java.service.TalkService;
import com.how2java.service.impl.MessageServiceImpI;
import com.how2java.util.Page;

@Controller
@RequestMapping("")
public class SchoolbaController {
	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkService;
	
	@Autowired
	MessageService mess;
	
	
	      @ModelAttribute 
	      public void populateModel(@RequestParam("userid") int userid, Model model) { 
	    	  System.out.println("userid"+userid);
	           model.addAttribute("userid", userid); 
	        } 
	
	@RequestMapping("getSchoolba")
	public ModelAndView getSchoolba(Page page, @RequestParam("id") Integer id,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		System.out.println(id);
		String aaa=request.getParameter("id");
		System.out.println("id"+aaa);
		Schoolba sb = schoolbaService.get(id);


		PageHelper.offsetPage(page.getStart(), 5);

		List<Talk> tl = talkService.list(id);


		int total = (int) new PageInfo<>(tl).getTotal();

		mav.addObject("tl", tl);


		page.caculateLast(total);

		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbalogo", sb.getSchoollogo());
		mav.addObject("schoolbawebsite", sb.getWebsite());

		mav.setViewName("getSchoolba");
		return mav;
	}
//	@RequestMapping("listTalk")
//	public ModelAndView listTalk() {
//		ModelAndView mav = new ModelAndView();
//		List<Talk> tl = schoolbaService.list();
//
//		mav.addObject("tl", tl);
//
//		mav.setViewName("getSchoolba");
//		return mav;
//	}
	
	@RequestMapping("searchlist")
	public ModelAndView searchlistCategory(String string,@RequestParam int userid) {

		ModelAndView mav = new ModelAndView();
		// PageHelper.offsetPage(page.getStart(), 5);
		List<Schoolba> ss = schoolbaService.searchlist(string);
		// int total = (int) new PageInfo<>(ss).getTotal();
		//
		// page.caculateLast(total);

		// 放入转发参数
		mav.addObject("ss", ss);
		mav.addObject("userid", userid);
		// 放入jsp路径
		mav.setViewName("searchlist");
		return mav;
	}

	@RequestMapping("introduction")
	public ModelAndView introduction(Integer id) {
		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(id);

		mav.addObject("sb", sb);
		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbalogo", sb.getSchoollogo());
		mav.addObject("schoolbawebsite", sb.getWebsite());
		mav.addObject("schoolbaintroduction", sb.getIntroduction());

		mav.setViewName("introduction");
		return mav;
	}

	@RequestMapping("picture")
	public ModelAndView picture(Integer id) {
		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(id);

		mav.addObject("sb", sb);
		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbalogo", sb.getSchoollogo());
		mav.addObject("schoolbawebsite", sb.getWebsite());

		mav.setViewName("picture");
		return mav;
	}

	@RequestMapping("policy")
	public ModelAndView policy(Integer id) {
		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(id);

		mav.addObject("sb", sb);
		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbalogo", sb.getSchoollogo());
		mav.addObject("schoolbawebsite", sb.getWebsite());
		mav.addObject("schoolbaintroduction", sb.getIntroduction());

		mav.setViewName("policy");
		return mav;
	}


	
	@RequestMapping("shiyan")
	public ModelAndView shiyan(){
		
		Message g=new Message();
		g.setFaUserID(2);
		g.setText("sddsd");
		g.setJieUserID(5);
		
		int j=mess.insertMessage(g);
		if(j>0){
			System.out.println("cg");
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
	}

}
