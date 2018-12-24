package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.TalkDetail;

public interface TalkDetailMapper {
	public List<TalkDetail> listdetail(@Param("id") Integer id, @Param("talkid") Integer talkid);

	public TalkDetail get(@Param("talkid") Integer talkid);
}
