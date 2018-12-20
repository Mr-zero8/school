package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.how2java.pojo.TalkDetail;
import com.how2java.service.TalkDetailService;

@Controller
@RequestMapping
public class TalkDetailController {
	@Autowired
	TalkDetailService talkDetailService;

	@RequestMapping("listTalkDetail")
	public ModelAndView listTalkDetail() {

		ModelAndView mav = new ModelAndView();
		List<TalkDetail> td = talkDetailService.listtalkdetail();

		mav.addObject("td", td);

		mav.setViewName("listTalkDetail");
		return mav;

	}
}
