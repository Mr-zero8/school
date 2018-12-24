package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.TalkDetail;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkDetailService;
import com.how2java.util.Page;

@Controller
@RequestMapping
public class TalkDetailController {
	@Autowired
	TalkDetailService talkDetailService;

	@Autowired
	SchoolbaService schoolbaService;

	@RequestMapping("listTalkDetail")
	public ModelAndView listTalkDetail(Page page, Integer id, Integer talkid) {

		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(id);
		TalkDetail t = talkDetailService.get(talkid);

		PageHelper.offsetPage(page.getStart(), 6);
		List<TalkDetail> td = talkDetailService.listdetail(id, talkid);

		int total = (int) new PageInfo<>(td).getTotal();

		mav.addObject("td", td);
		mav.addObject("t", t);

		page.caculateLast(total);
		
//		System.out.println("t.getId():"+t.getId());
//		
//		 mav.addObject("talkidd", t.getId());
		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbaimg", sb.getImg());
		mav.setViewName("listTalkDetail");
		return mav;

	}
}
