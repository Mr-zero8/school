package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkDetailService;
import com.how2java.service.TalkService;
import com.how2java.util.Page;

@Controller
//@SessionAttributes("Userid")

@RequestMapping("")
public class SchoolbaController {
	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkService;

	@Autowired
	TalkDetailService talkDetailService;

	// @ModelAttribute
	// public void populateModel(@RequestParam("userid") int userid, Model
	// model) {
	// System.out.println("userid" + userid);
	// model.addAttribute("userid", userid);
	// }

	@RequestMapping("getSchoolba")
	public ModelAndView getSchoolba(
			 Page page, Integer id, ModelMap model) {
		ModelAndView mav = new ModelAndView();

		System.out.println(id);
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
		mav.addObject("schoolbawebsite", sb.getWebsite());

//		System.out.println("other controller de userid:" + getuserid);


		mav.setViewName("getSchoolba");
		return mav;
	}

	// @RequestMapping("listSchoolba")
	// public ModelAndView listSchoolba() {
	// ModelAndView mav = new ModelAndView();
	//
	// List<Schoolba> sl = schoolbaService.listschool();
	// // PageHelper.offsetPage(page.getStart(), 5);
	//
	// // int total = (int) new PageInfo<>(tl).getTotal();
	// mav.addObject("sl", sl);
	// // page.caculateLast(total);
	//
	// mav.setViewName("listSchoolba");
	// return mav;
	// }

	@RequestMapping("index")
	public ModelAndView searchlistCategory(
			 String string, ModelMap model) {

		ModelAndView mav = new ModelAndView();

		List<Schoolba> ss = schoolbaService.searchlist(string);
		mav.addObject("ss", ss);
		

		
//		System.out.println("other controller de userid:" + getuserid);


		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("introduction")
	public ModelAndView introduction(Integer id, ModelMap model) {
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

		// System.out.println("other controller de userid:" + getuserid);

		mav.setViewName("introduction");
		return mav;
	}
	
	@RequestMapping("updateschoolinfo")
	public ModelAndView updateschoolinfo(String info) {
		ModelAndView mav = new ModelAndView();
		schoolbaService.updateinfo(info);


		// System.out.println("other controller de userid:" + getuserid);

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

}
