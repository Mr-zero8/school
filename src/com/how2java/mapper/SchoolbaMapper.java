package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaMapper {
	public Schoolba get(int id);

	public List<Talk> list();
}
