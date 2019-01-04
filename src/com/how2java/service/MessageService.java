package com.how2java.service;

import java.util.List;

import com.how2java.pojo.Message;

public interface MessageService {

	public int insertMessage(Message a);
	
	public List<Message> selectAllmessageByid(int jieUserID);
}
