package com.how2java.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list() {
		return categoryMapper.list();
	}

	@Override
	public void add(Category c) {
		categoryMapper.add(c);

	}

	@Override
	public void update(Category c) {
		categoryMapper.update(c);
	}

	@Override
	public void delete(Category c) {
		categoryMapper.delete(c.getId());
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	};

	@Override
	public List<Category> searchlist(String string){
		// TODO Auto-generated method stub
		return categoryMapper.searchlist(string);
	};

}
