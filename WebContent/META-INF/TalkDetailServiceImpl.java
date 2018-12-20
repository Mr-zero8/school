package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.pojo.TalkDetail;
import com.how2java.service.TalkDetailService;

@Service
public class TalkDetailServiceImpl implements TalkDetailService {
	@Autowired
	TalkDetailService talkDetailService;

	@Override
	public List<TalkDetail> listtalkdetail() {
		// TODO Auto-generated method stub

		return talkDetailService.listtalkdetail();
	}

}
