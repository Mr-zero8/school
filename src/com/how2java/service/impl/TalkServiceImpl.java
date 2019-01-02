package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.TalkMapper;
import com.how2java.pojo.Talk;
import com.how2java.service.TalkService;

@Service
public class TalkServiceImpl implements TalkService {
	@Autowired
	TalkMapper talkMapper;

	@Override
	public List<Talk> list(Integer id) {
		// TODO Auto-generated method stub
		return talkMapper.list(id);
	}

	@Override
	public Talk byidone(int id) {
		// TODO Auto-generated method stub
		return talkMapper.byidone(id);
	}

//	@Override
//	public Talk get(Integer id) {
//		return talkMapper.get(id);
//	}

}
