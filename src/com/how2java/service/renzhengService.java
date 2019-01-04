package com.how2java.service;

import java.util.List;

import com.how2java.pojo.renzheng;

public interface renzhengService {

	public void insertOne(renzheng a);
	
	public List<renzheng> selectByid(int id);
	
	public void deleteonebyusername(String a);
}
