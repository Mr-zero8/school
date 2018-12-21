package com.how2java.mapper;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.User;

public interface UserMapper {
	// public void login(String username, String passwrod);
	//
	// public void getu(@Param("string")String username);
	public void findUserByNameAndPwd(@Param("name") String name, @Param("password") String password);
	
	public void gaireport(User us);
}
