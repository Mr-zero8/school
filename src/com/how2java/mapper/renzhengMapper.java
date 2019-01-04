package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.renzheng;

public interface renzhengMapper {
	public void insertOne(renzheng a);
	
	public List<renzheng> selectByid(int id);
	
	public void deleteonebyusername(String a);
}
