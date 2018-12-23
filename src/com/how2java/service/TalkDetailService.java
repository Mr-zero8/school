package com.how2java.service;

import java.util.List;


import com.how2java.pojo.TalkDetail;

public interface TalkDetailService {
	List<TalkDetail> listdetail(Integer id,Integer talkid);
}
