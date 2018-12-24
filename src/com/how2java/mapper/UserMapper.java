package com.how2java.mapper;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.User;

public interface UserMapper {
	// public void login(String username, String passwrod);
	//
	// public void getu(@Param("string")String username);
	public User findUserByNameAndPwd(@Param("name") String name, @Param("password") String password);
	
	public void gaireport(int id);
	
	//用户上传头像
	public void addImage(String image,int id);
}
