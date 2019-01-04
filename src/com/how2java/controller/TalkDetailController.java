package com.how2java.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.pojo.TalkDetail;
import com.how2java.pojo.User;
import com.how2java.pojo.userlike;
import com.how2java.service.SchoolbaService;
import com.how2java.service.TalkDetailService;
import com.how2java.service.TalkService;
import com.how2java.service.UserService;
import com.how2java.service.userlikeService;
import com.how2java.util.Page;

@Controller
@SessionAttributes("Userid")
@RequestMapping
public class TalkDetailController {
	@Autowired
	TalkDetailService talkDetailService;

	@Autowired
	SchoolbaService schoolbaService;

	@Autowired
	TalkService talkone;
	
	@Autowired
	userlikeService like;
	
	@Autowired
	UserService user;
	
	
/*	public static HttpSession getSession() { 
	    HttpSession session = null; 
	    try { 
	        session = getRequest().getSession(); 
	    } catch (Exception e) {} 
	        return session; 
	} 
	    
	public static HttpServletRequest getRequest() { 
	    ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
	    return attrs.getRequest(); 
	}*/
	
	
	//schoolid talkid 
	@RequestMapping("listTalkDetail")
	public ModelAndView listTalkDetail(Page page, Integer id,Integer talkid) {

		ModelAndView mav = new ModelAndView();

		Schoolba sb = schoolbaService.get(id);
		TalkDetail t = talkDetailService.gettalkid(talkid);

		PageHelper.offsetPage(page.getStart(), 6);
		List<TalkDetail> td = talkDetailService.listdetail(id,talkid);

		int total = (int) new PageInfo<>(td).getTotal();

		mav.addObject("td", td);
//		mav.addObject("t", t);

		page.caculateLast(total);
		
		System.out.println("t.getTalkId():"+t.getTalkid());
	
		mav.addObject("talkid", t.getTalkid());
		mav.addObject("schoolbaid", sb.getId());
		mav.addObject("schoolbaname", sb.getName());
		mav.addObject("schoolbaconcern", sb.getConcern());
		mav.addObject("schoolbatalkcount", sb.getTalkcount());
		mav.addObject("schoolbalocation", sb.getLocation());
		mav.addObject("schoolbalogo", sb.getSchoollogo());
		mav.addObject("schoolbawebsite", sb.getWebsite());
		mav.setViewName("listTalkDetail");
		
		
		return mav;
	}

	//完成收藏行为
		@RequestMapping("shouchangING")
		public ModelAndView listTalkDetail(Page page,int talkid,int schoolid,HttpServletRequest request,
				HttpSession session,@ModelAttribute("Userid") int userid) {

			
			System.out.println("用户ID"+userid);
			
			
			ModelAndView mav = new ModelAndView();

			System.out.println("school"+schoolid);
			Schoolba sb = schoolbaService.get(schoolid);
			TalkDetail t = talkDetailService.gettalkid(talkid);
			Talk c=talkone.byidone(talkid);
			userlike a=new userlike();
			a.setUserid(userid);
			a.setTalkid(talkid);
			String ccccc=null;
			
			try {
				 ccccc=dateToStamp(c.getUpdatetime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			like.shouchang(a);
			int cc=like.allcount();
			like.updatetime(ccccc, cc);
			PageHelper.offsetPage(page.getStart(), 6);
			List<TalkDetail> td = talkDetailService.listdetail(schoolid,talkid);

			int total = (int) new PageInfo<>(td).getTotal();

			mav.addObject("td", td);
//			mav.addObject("t", t);

			page.caculateLast(total);
			
			System.out.println("t.getTalkId():"+t.getTalkid());
		
			
			
			session.setAttribute("msg1","收藏成功");
			
			
			mav.addObject("talkid", t.getTalkid());
			mav.addObject("schoolbaid", sb.getId());
			mav.addObject("schoolbaname", sb.getName());
			mav.addObject("schoolbaconcern", sb.getConcern());
			mav.addObject("schoolbatalkcount", sb.getTalkcount());
			mav.addObject("schoolbalocation", sb.getLocation());
			mav.addObject("schoolbalogo", sb.getSchoollogo());
			mav.addObject("schoolbawebsite", sb.getWebsite());
			
			mav.setViewName("listTalkDetail");
			
			return mav;
		}
		
	    public static String dateToStamp(String s) throws ParseException{
	        String res;
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	        Date date = simpleDateFormat.parse(s);
	        long ts = date.getTime()/1000;
	        res = String.valueOf(ts);
	        return res;
	    }
	    //发言
	    @RequestMapping("TalkDetail")
	    public ModelAndView TalkDetail(Page page, int talkid,ModelMap model,MultipartFile fileimg,HttpSession session
	    		,HttpServletRequest request,String say,@ModelAttribute("Userid") int userid) throws IllegalStateException, IOException{
	    	String path="";
		    String filename=null;
		    if(!fileimg.isEmpty()){
		        // 上传的文件路径  建在WebRoot目录下--fileupload
		        path = session.getServletContext().getRealPath("/fileupload/");
		        // 上传文件名
		         filename = fileimg.getOriginalFilename();

		        System.out.println(filename);
		        System.out.println(path);
		        // 做一个判断 图片扩展名   substring(int index) 返回一个以index为索引作为起点的含头不含尾的后面的字符串 
		        String types = filename.substring(filename.lastIndexOf(".")+1).toLowerCase();

		        // 如果有需求是要修改上传的图片的名字为用户id开头的
		        //String newfilename = account+filename.substring(filename.lastIndexOf(".")); // 取得的是 .jpg

		        File filepath = new File(path,filename);
		        // 判断路径是否存在，不存在就创建一个
		        if(!filepath.getParentFile().exists()){
		            filepath.getParentFile().mkdirs();
		        }
		        fileimg.transferTo(new File(path + File.separator + filename)); // 会上传到服务器中的路径
		    }
		 
		    path=path+filename;
		    
		 
		 String idi=request.getParameter("schoolid");
		 
		 int id=Integer.parseInt(idi);
		 
		 System.out.println("sdssdsdsdsds"+id);
		 model.put("schoolid",id);
		 model.put("talkid",talkid);
		
		 
		 
		 User aa=user.byid(userid);
		 TalkDetail talk=new TalkDetail();
		 long currentTime=new Date().getTime()/1000;
		 String shijian=currentTime+"";
		 talk.setWritetime(shijian);
		 talk.setAuthorname(aa.getUsername());
		 talk.setAuthorphoto(aa.getImage());
		 talk.setImg(path);
		 talk.setTalkid(talkid);
		    path=path+filename;
		    Integer max=talkDetailService.max(talkid);
		    if(max==null){
		    	 max=1;
		    }else{max=max+1;}
		    
		 talk.setSort(max);
		 talk.setAuthortext(say);
		 talkDetailService.fayan(talk);
		 talkDetailService.updatetime(currentTime,max);
		 
		 ModelAndView mav = new ModelAndView();
		 Schoolba sb = schoolbaService.get(id);
			TalkDetail t = talkDetailService.gettalkid(talkid);

			PageHelper.offsetPage(page.getStart(), 6);
			List<TalkDetail> td = talkDetailService.listdetail(id,talkid);

			int total = (int) new PageInfo<>(td).getTotal();

			mav.addObject("td", td);
//			mav.addObject("t", t);

			page.caculateLast(total);
			
			System.out.println("t.getTalkId():"+t.getTalkid());
		
			mav.addObject("talkid", t.getTalkid());
			mav.addObject("schoolbaid", sb.getId());
			mav.addObject("schoolbaname", sb.getName());
			mav.addObject("schoolbaconcern", sb.getConcern());
			mav.addObject("schoolbatalkcount", sb.getTalkcount());
			mav.addObject("schoolbalocation", sb.getLocation());
			mav.addObject("schoolbalogo", sb.getSchoollogo());
			mav.addObject("schoolbawebsite", sb.getWebsite());
			mav.setViewName("listTalkDetail");
			
			return mav;
	    }
}
