package com.how2java.controller;

import java.rmi.server.SocketSecurityException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkService;
import com.how2java.util.Page;

@Controller
@RequestMapping("")
public class SchoolbaController {
	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkService;

	@RequestMapping("getSchoolba")

	public ModelAndView getSchoolba(Page page, Integer id) {
		ModelAndView mav = new ModelAndView();
		
		System.out.println(id);
		Schoolba sb = schoolbaService.get(id);
		

		PageHelper.offsetPage(page.getStart(), 5);
		List<Talk> tl = talkService.list();
		int total = (int) new PageInfo<>(tl).getTotal();
		mav.addObject("tl", tl);
		page.caculateLast(total);

		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbaimg", sb.getImg());
		
		mav.setViewName("getSchoolba");
		return mav;
	}
	


	@RequestMapping("listSchoolba")
	public ModelAndView listSchoolba() {
		ModelAndView mav = new ModelAndView();

		List<Schoolba> sl = schoolbaService.listschool();
		// PageHelper.offsetPage(page.getStart(), 5);

		// int total = (int) new PageInfo<>(tl).getTotal();
		mav.addObject("sl", sl);
		// page.caculateLast(total);

		mav.setViewName("listSchoolba");
		return mav;
	}

	@RequestMapping("searchlist")
	public ModelAndView searchlistCategory(String string) {

		ModelAndView mav = new ModelAndView();
		// PageHelper.offsetPage(page.getStart(), 5);
		List<Schoolba> ss = schoolbaService.searchlist(string);
		// int total = (int) new PageInfo<>(ss).getTotal();
		//
		// page.caculateLast(total);

		// 放入转发参数
		mav.addObject("ss", ss);
		// 放入jsp路径
		mav.setViewName("searchlist");
		return mav;
	}

	// @RequestMapping("listTalk")
	// public ModelAndView listTalk() {
	// ModelAndView mav = new ModelAndView();
	// List<Talk> tl = schoolbaService.list();
	//
	// mav.addObject("tl", tl);
	//
	// mav.setViewName("getSchoolba");
	// return mav;
	// }

}
