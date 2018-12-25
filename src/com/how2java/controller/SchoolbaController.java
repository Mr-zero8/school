package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("")
public class SchoolbaController {
	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkService;

	@Autowired
	TalkDetailService talkDetailService;

	@RequestMapping("getSchoolba")
	public ModelAndView getSchoolba(Page page, Integer id) {
		ModelAndView mav = new ModelAndView();

		System.out.println(id);
		Schoolba sb = schoolbaService.get(id);
		// TalkDetail t= talkDetailService.get(talkid);

		PageHelper.offsetPage(page.getStart(), 5);

		List<Talk> tl = talkService.list(id);
		// List<TalkDetail> td = talkDetailService.listdetail(id);

		int total = (int) new PageInfo<>(tl).getTotal();

		mav.addObject("tl", tl);
		// mav.addObject("td", td);
		System.out.println("!!!#!#!#!#" + sb.getWebsite());
		page.caculateLast(total);
		// mav.addObject("talkid", t.getId());
		System.out.println("sb.getId()：" + sb.getId());
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

}
