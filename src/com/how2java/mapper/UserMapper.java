package com.how2java.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	// public void login(String username, String passwrod);
	//
	// public void getu(@Param("string")String username);
	public void findUserByNameAndPwd(@Param("name") String name, @Param("password") String password);
}
