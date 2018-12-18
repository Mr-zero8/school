package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Category;

public interface CategoryMapper {

	public int add(Category category);

	public void delete(int id);

	public Category get(int id);

	public int update(Category category);

	public List<Category> list();

	public List<Category> searchlist(@Param("string")String string);

}