package com.how2java.service;

import com.how2java.pojo.User;

public interface UserService {
	void login(String name, String password);
	
	public void gaireport(User us);
}
