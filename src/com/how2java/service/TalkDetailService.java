package com.how2java.service;

import java.util.List;

import com.how2java.pojo.TalkDetail;
import com.how2java.pojo.fayan;

public interface TalkDetailService {
	List<TalkDetail> list();

	TalkDetail get(Integer id);
	

	//举报该层
	public void jubao(int id);
	//展示被举报的评论
	public List<TalkDetail> chuli();
	//屏蔽违规发言
	public void pingbifayan(String a,int b);
	//已经处理的举报
	public List<TalkDetail> reported();
	
	public void fayan(TalkDetail a);
	
	List<TalkDetail> listdetail(Integer id, Integer talkid);

	TalkDetail gettalkid(Integer talkid);
	
	public Integer max(int a);
	
	public void updatetime(long a,int b);
}
