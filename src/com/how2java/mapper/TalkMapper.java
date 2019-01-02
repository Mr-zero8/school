package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Talk;

public interface TalkMapper {
	public List<Talk> list(@Param("id")Integer id);

	public Talk byidone(int id);
	
//	public Talk get(Integer id);
}
