package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.renzhengMapper;
import com.how2java.pojo.renzheng;
import com.how2java.service.renzhengService;
@Service
public class renzhengServiceImpI implements renzhengService{

	@Autowired
	renzhengMapper Mapper;
	
	@Override
	public void insertOne(renzheng a) {
		
		Mapper.insertOne(a);
	}

	@Override
	public List<renzheng> selectByid(int id) {
		
		return Mapper.selectByid(id);
	}

	@Override
	public void deleteonebyusername(String a) {
		
		Mapper.deleteonebyusername(a);
	}

}
