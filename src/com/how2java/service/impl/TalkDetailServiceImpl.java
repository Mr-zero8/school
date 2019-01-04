package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.TalkDetailMapper;
import com.how2java.pojo.TalkDetail;
import com.how2java.service.TalkDetailService;

@Service
public class TalkDetailServiceImpl implements TalkDetailService {
	@Autowired
	TalkDetailMapper talkDetailMapper;

	@Override
	public List<TalkDetail> listdetail(Integer id,Integer talkid) {
		// TODO Auto-generated method stub

		return talkDetailMapper.listdetail(id,talkid);
	}

	@Override
	public TalkDetail gettalkid(Integer talkid) {
		// TODO Auto-generated method stub
		return talkDetailMapper.gettalkid(talkid);
	}

	@Override
	public List<TalkDetail> searchtalkdetail(String keyword) {
		// TODO Auto-generated method stub
		return talkDetailMapper.searchtalkdetail(keyword);
	}

}
