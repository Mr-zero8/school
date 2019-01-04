package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Talk;

public interface TalkMapper {
	// 加载学校的帖子
	public List<Talk> list(@Param("id") Integer id);

	// 加载收藏的帖子
	public List<Talk> likelist(@Param("id") Integer id);
	// public Talk get(Integer id);

	// 管理员删除帖子
	public void deletetalk(@Param("talkid") Integer talkid);
}
