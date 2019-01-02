package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.TalkDetailMapper;
import com.how2java.pojo.TalkDetail;
import com.how2java.pojo.fayan;
import com.how2java.service.TalkDetailService;

@Service
public class TalkDetailServiceImpl implements TalkDetailService {
	@Autowired
	TalkDetailMapper talkMapper;

	@Override
	public List<TalkDetail> list() {
		// TODO Auto-generated method stub
		return talkMapper.list();
	}

	@Override
	public TalkDetail get(Integer id) {
		return talkMapper.get(id);
	}

	@Override
	public void jubao(int id) {
		// TODO Auto-generated method stub
		talkMapper.jubao(id);
	}

	@Override
	public List<TalkDetail> chuli() {
		// TODO Auto-generated method stub
		return talkMapper.chuli();
	}

	@Override
	public void pingbifayan(String a, int b) {
		// TODO Auto-generated method stub
		talkMapper.pingbifayan(a, b);
	}

	@Override
	public List<TalkDetail> reported() {
		// TODO Auto-generated method stub
		
		return talkMapper.reported();
	}

	@Override
	public void fayan(TalkDetail a) {
		// TODO Auto-generated method stub
		talkMapper.fayan(a);
	}

	@Override
	public List<TalkDetail> listdetail(Integer id,Integer talkid) {
		// TODO Auto-generated method stub

		return talkMapper.listdetail(id,talkid);
	}

	@Override
	public TalkDetail gettalkid(Integer talkid) {
		// TODO Auto-generated method stub
		return talkMapper.gettalkid(talkid);
	}

	@Override
	public Integer max(int a) {
		// TODO Auto-generated method stub
		return talkMapper.max(a)
				;
	}

	@Override
	public void updatetime(long a, int b) {
		// TODO Auto-generated method stub
		talkMapper.updatetime(a, b);
	}


	
	
}
