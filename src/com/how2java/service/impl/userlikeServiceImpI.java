package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.userlikeMapper;
import com.how2java.pojo.userlike;
import com.how2java.service.userlikeService;
@Service
public class userlikeServiceImpI implements userlikeService{
	@Autowired
	userlikeMapper userlik;
	public List<userlike> likewhat(int id){
		
		return userlik.likewhat(id);
	}
	public void shouchang(userlike a) {
		
		userlik.shouchang(a);
	}
	
}
