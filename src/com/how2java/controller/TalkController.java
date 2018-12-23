package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Talk;
import com.how2java.service.TalkService;

@Controller
@RequestMapping
public class TalkController {
//	@Autowired
//	TalkService talkService;

//	@RequestMapping("listTalk")
//	public ModelAndView listTalk(Integer id) {
//		ModelAndView mav = new ModelAndView();
//		List<Talk> tl = talkService.list(id);
//
//		mav.addObject("tl", tl);
//
//		mav.setViewName("listTalk");
//		return mav;
//	}

//	@RequestMapping("getTalk")
//	public ModelAndView getTalk(Integer id) {
//		ModelAndView mav = new ModelAndView();
//		Talk tk = talkService.get(1);
//		System.out.println(tk.getAuthor());
//		mav.addObject("tk", tk);
//		
//		
//
//		mav.addObject("title", tk.getTitle());
//		mav.addObject("talkcount", tk.getTalkcount());
//		mav.addObject("author", tk.getAuthor());
//		mav.addObject("starttime", tk.getStarttime());
//		mav.addObject("updatetime", tk.getUpdatetime());
//		mav.setViewName("getSchoolba");
//		return mav;
//	}
}
