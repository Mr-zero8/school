package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.userlike;

public interface userlikeMapper {

	public List<userlike> likewhat(int id);
	
	public void shouchang(userlike a);
}
