package com.how2java.mapper;

import org.apache.ibatis.annotations.Param;

import com.how2java.pojo.User;

public interface UserMapper {
	public void login(String username, String passwrod);

	//
	// public void getu(@Param("string")String username);
	public User findUserByNameAndPwd(@Param("name") String name, @Param("password") String password);

	public void gaireport(int id);

	// 用户上传头像
	public void addImage(String image, int id);

	// 查找用户靠id
	public User byid(int id);

	// 登录是否成功
	public int shifou(@Param("name") String name, @Param("password") String password);

	// 用户是否已经存在
	public int findUserByUserName(String username);

	// 插入新用户
	public void insertUser(User a);

	// 验证唯一邮箱
	public int emailone(String a);

	// 根据用户名查找id
	public User getuserid(String username);
}
