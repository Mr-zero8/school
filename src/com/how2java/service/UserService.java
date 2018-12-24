package com.how2java.service;

import com.how2java.pojo.User;

public interface UserService {
	User login(String name, String password);
	//修改是否禁言
	public void gaireport(int id);
	//用户上传头像
	public void addImage(String image,int id);
}
