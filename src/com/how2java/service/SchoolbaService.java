package com.how2java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaService {
	Schoolba get(int id);

	List<Talk> list();

	List<Schoolba> listschool();

	List<Schoolba> searchlist(String string);
	// List<TalkDetail> listtalkdetail();
}
