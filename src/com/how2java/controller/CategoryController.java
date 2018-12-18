package com.how2java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {

		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(), 5);
		List<Category> cs = categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();

		page.caculateLast(total);

		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category) {
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}

	@RequestMapping("deleteCategory")
	public ModelAndView deleteCategory(Category category) {
		categoryService.delete(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}

	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category category) {
		Category c = categoryService.get(category.getId());
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}

	@RequestMapping("updateCategory")
	public ModelAndView updateCategory(Category category) {
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}

	@RequestMapping("searchlistCategory")
	public ModelAndView searchlistCategory(Page page, String string) {

		ModelAndView mav = new ModelAndView("redirect:/listSearch");
		PageHelper.offsetPage(page.getStart(), 5);
		List<Category> ss = categoryService.searchlist(string);
		int total = (int) new PageInfo<>(ss).getTotal();

		page.caculateLast(total);

		// 放入转发参数
		mav.addObject("ss", ss);
		// 放入jsp路径
		mav.setViewName("listSearch");
		return mav;
	}


}
