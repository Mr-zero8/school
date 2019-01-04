package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.Talk;
import com.how2java.pojo.TalkDetail;
import com.how2java.service.TalkDetailService;
import com.how2java.service.TalkService;

@Controller
@RequestMapping
public class TalkController {
	@Autowired
	TalkService talkService;

	@Autowired
	TalkDetailService talkDetailService;

	@RequestMapping("deleteTalk")
	public ModelAndView deletTalk(Integer talkid, Integer schoolid) {
		ModelAndView mav = new ModelAndView();

		talkService.deletetalk(talkid);
		mav.addObject("schoolid", schoolid);
		mav.setViewName("getSchoolba");
		return mav;
	}

	@RequestMapping("searchTalk")
	public ModelAndView searchTalk(String keyword) {
		ModelAndView mav = new ModelAndView();
		List<TalkDetail> talkdetail = talkDetailService.searchtalkdetail(keyword);
		mav.addObject("keyword", keyword);
		mav.addObject("ts", talkdetail);
		mav.setViewName("searchTalk");
		return mav;
	}

}
