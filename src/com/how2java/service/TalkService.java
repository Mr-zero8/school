package com.how2java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Talk;

public interface TalkService {
	List<Talk> list(Integer id);

	List<Talk> likelist(Integer id);
	// Talk get(Integer id);
	void deletetalk(Integer talkid);
}
