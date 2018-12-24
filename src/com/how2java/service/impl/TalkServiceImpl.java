package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.TalkMapper;
import com.how2java.pojo.Talk;
import com.how2java.pojo.fayan;
import com.how2java.service.TalkService;

@Service
public class TalkServiceImpl implements TalkService {
	@Autowired
	TalkMapper talkMapper;

	@Override
	public List<Talk> list() {
		// TODO Auto-generated method stub
		return talkMapper.list();
	}

	@Override
	public Talk get(Integer id) {
		return talkMapper.get(id);
	}

	@Override
	public void jubao(int id) {
		// TODO Auto-generated method stub
		talkMapper.jubao(id);
	}

	@Override
	public List<fayan> chuli() {
		// TODO Auto-generated method stub
		return talkMapper.chuli();
	}

	@Override
	public void pingbifayan(String a, int b) {
		// TODO Auto-generated method stub
		talkMapper.pingbifayan(a, b);
	}

	@Override
	public List<fayan> reported() {
		// TODO Auto-generated method stub
		return talkMapper.reported();
	}

}
