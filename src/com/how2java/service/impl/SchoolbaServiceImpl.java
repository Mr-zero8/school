package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.SchoolbaMapper;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;
import com.how2java.service.SchoolbaService;

@Service
public class SchoolbaServiceImpl implements SchoolbaService {
	@Autowired
	SchoolbaMapper schoolbaMapper;

	@Override
	public Schoolba get(int id) {
		return schoolbaMapper.get(id);
	}

	@Override
	public List<Talk> list() {
		return schoolbaMapper.list();
	}

}
