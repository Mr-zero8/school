package com.how2java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.TalkDetail;

public interface TalkDetailService {
	List<TalkDetail> listdetail(Integer id, Integer talkid);

	TalkDetail gettalkid(Integer talkid);

	List<TalkDetail> searchtalkdetail(String keyword);
}
