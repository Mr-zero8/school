package com.how2java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public void login(String name, String password) {
		// TODO Auto-generated method stub
		userMapper.findUserByNameAndPwd(name, password);
	}

	@Override
	public void gaireport(User us) {
		
		userMapper.gaireport(us);
	}



}
