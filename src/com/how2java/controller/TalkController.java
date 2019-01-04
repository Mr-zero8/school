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

import com.how2java.pojo.TalkDetail;
import com.how2java.pojo.fayan;
import com.how2java.service.TalkDetailService;
import com.how2java.service.UserService;

@Controller
@SessionAttributes("Userid")
@RequestMapping
public class TalkController {
	@Autowired
	TalkDetailService talkService;
	@Autowired
	UserService us;
	@RequestMapping("listTalk")
	public ModelAndView listTalk() {
		ModelAndView mav = new ModelAndView();
		List<TalkDetail> tl = talkService.list();

		mav.addObject("tl", tl);

		mav.setViewName("listTalk");
		return mav;
	}

	
/*	@RequestMapping("getTalk")
	public ModelAndView getTalk(Integer id) {
		ModelAndView mav = new ModelAndView();
		Talk tk = talkService.get(1);
		System.out.println(tk.getAuthor());
		mav.addObject("tk", tk);
		mav.addObject("title", tk.getTitle());
		mav.addObject("talkcount", tk.getTalkcount());
		mav.addObject("author", tk.getAuthor());
		mav.addObject("starttime", tk.getStarttime());
		mav.addObject("updatetime", tk.getUpdatetime());
		mav.setViewName("getSchoolba");
		return mav;
	}*/
	
	@RequestMapping(value ="/fayan")
	public String selectALLfayan(ModelMap model){
		//加载所有评论
		List<TalkDetail> a=talkService.list();
		model.addAttribute("fayanlist", a);

		//加载所有举报
		List<TalkDetail> repotred=talkService.chuli();
		model.addAttribute("jubaolist", repotred);
		
		//已经被处理的举报
		List<TalkDetail> ed=talkService.reported();
		model.addAttribute("reported", ed);
		
		return "jinyan";
	}
	@RequestMapping(value ="/jinyan")
	public String reported(ModelMap model,@RequestParam int id){
	
		talkService.jubao(id);
		
		//加载所有评论
		List<TalkDetail> a=talkService.list();
		model.addAttribute("fayanlist", a);

		//加载所有举报
		List<TalkDetail> repotred=talkService.chuli();
		model.addAttribute("jubaolist", repotred);
		
		//已经被处理的举报
		List<TalkDetail> ed=talkService.reported();
		model.addAttribute("reported", ed);
		
		return "jinyan";
	}
	@RequestMapping(value ="/chulijubao")
	public String chulijubao(@RequestParam int id,ModelMap model,@RequestParam int userid){

		
		talkService.pingbifayan("该评论因被举报而屏蔽", id);
		us.gaireport(userid);
		
		//加载所有评论
		List<TalkDetail> a=talkService.list();
		model.addAttribute("fayanlist", a);

		//加载所有举报
		List<TalkDetail> repotred=talkService.chuli();
		model.addAttribute("jubaolist", repotred);
		
		//已经被处理的举报
		List<TalkDetail> ed=talkService.reported();
		model.addAttribute("reported", ed);
		
		return "jinyan";
	}
}
