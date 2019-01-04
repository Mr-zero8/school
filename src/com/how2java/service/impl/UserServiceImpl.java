package com.how2java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return userMapper.findUserByNameAndPwd(name, password);
	}

	@Override
	public void gaireport(int id) {

		userMapper.gaireport(id);
	}

	@Override
	public void addImage(String image, int id) {
		// TODO Auto-generated method stub
		userMapper.addImage(image, id);
	}

	@Override
	public User byid(int id) {
		// TODO Auto-generated method stub
		return userMapper.byid(id);
	}

	@Override
	public int shifou(String name, String password) {
		// TODO Auto-generated method stub
		return userMapper.shifou(name, password);
	}

	@Override
	public int findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.findUserByUserName(username);
	}

	@Override
	public void insertUser(User a) {
		// TODO Auto-generated method stub
		userMapper.insertUser(a);
	}

	@Override
	public int emailone(String a) {
		// TODO Auto-generated method stub
		return userMapper.emailone(a);
	}

	@Override
	public User getuserid(String username) {
		return userMapper.getuserid(username);
	}

}
