package com.how2java.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaService {
	Schoolba get(Integer id);

//	List<Talk> list(Integer id);

//	List<Schoolba> listschool();

	List<Schoolba> searchlist(String string);
	// List<TalkDetail> listtalkdetail();
	
	void updateinfo(String info);
}
