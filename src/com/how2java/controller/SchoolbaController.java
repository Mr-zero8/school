package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkService;

@Controller
@RequestMapping("")
public class SchoolbaController {
	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkService;
	@RequestMapping("getSchoolba")
	public ModelAndView getSchoolba() {
		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(1);

		List<Talk> tl = talkService.list();
		mav.addObject("tl", tl);
		
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbaimg", sb.getImg());
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

}
