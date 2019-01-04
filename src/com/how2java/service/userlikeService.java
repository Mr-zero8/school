package com.how2java.service;

import java.util.List;

import com.how2java.pojo.userlike;

public interface userlikeService {

	public List<userlike> likewhat(int id);
	
	public void shouchang(userlike a);
}
