package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Talk;

public interface TalkService {
	List<Talk> list(Integer id);

	public Talk byidone(int id);
//	Talk get(Integer id);
}
