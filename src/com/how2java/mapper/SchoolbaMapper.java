package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaMapper {
	public Schoolba get(int id);

	public List<Schoolba> listschool();

	public List<Talk> list();

	public List<Schoolba> searchlist(@Param("string") String string);

	// public List<TalkDetail> listtalkdetail();
}
