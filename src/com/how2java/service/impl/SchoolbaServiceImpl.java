package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.SchoolbaMapper;
import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

import com.how2java.service.SchoolbaService;

@Service
public class SchoolbaServiceImpl implements SchoolbaService {
	@Autowired
	SchoolbaMapper schoolbaMapper;

	@Override
	public Schoolba get(Integer id) {
		return schoolbaMapper.get(id);
	}

	@Override
	public List<Talk> list() {
		return schoolbaMapper.list();
	}

	@Override
	public List<Schoolba> listschool() {
		// TODO Auto-generated method stub
		return schoolbaMapper.listschool();
	}

	@Override
	public List<Schoolba> searchlist(String string) {
		// TODO Auto-generated method stub
		return schoolbaMapper.searchlist(string);
	}

//	@Override
//	public List<TalkDetail> listtalkdetail() {
//		// TODO Auto-generated method stub
//		return schoolbaMapper.listtalkdetail();
//	}

}
