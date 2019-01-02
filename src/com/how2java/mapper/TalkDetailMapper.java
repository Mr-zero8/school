package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.TalkDetail;


public interface TalkDetailMapper {
	public List<TalkDetail> list();

	public TalkDetail get(Integer id);
	

	//举报该层
	public void jubao(int id);
	//展示被举报的评论
	public List<TalkDetail> chuli();
	//屏蔽违规发言
	public void pingbifayan(String a,int b);
	//已经处理的举报
	public List<TalkDetail> reported();
	
	
	public void fayan(TalkDetail a);
	
	public List<TalkDetail> listdetail(@Param("id") Integer id, @Param("talkid") Integer talkid);

	public TalkDetail gettalkid(@Param("talkid") Integer talkid);
	
	public Integer max(int a);
	
	public void updatetime(long a,int b);
}
