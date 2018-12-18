package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Talk;

public interface TalkMapper {
	public List<Talk> list();

	public Talk get(Integer id);
}
