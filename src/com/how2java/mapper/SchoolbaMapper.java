package com.how2java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaMapper {
	public Schoolba get(@Param("id") Integer id);

	public List<Schoolba> searchlist(@Param("string") String string);

	public void updateinfo(@Param("string") String info);
}
