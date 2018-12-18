package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Schoolba;
import com.how2java.pojo.Talk;

public interface SchoolbaService {
	Schoolba get(int id);

	List<Talk> list();
}
