package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.MessageMapper;
import com.how2java.pojo.Message;
import com.how2java.service.MessageService;
@Service
public class MessageServiceImpI implements MessageService{

	@Autowired
	MessageMapper messageMappe;
	@Override
	public int insertMessage(Message a) {
		
		return messageMappe.insertMessage(a);
	}
	
	@Override
	public List<Message> selectAllmessageByid(int jieUserID) {
		// TODO Auto-generated method stub
		return messageMappe.selectAllmessageByid(jieUserID);
	}

	public static void main(String[] args) throws Exception {
		MessageServiceImpI c=new MessageServiceImpI();
		Message g=new Message();
		g.setFaUserID(2);
		g.setText("sddsd");
		g.setJieUserID(5);
		
		int j=c.insertMessage(g);
		if(j>0){
			System.out.println("cg");
		}
	}


}
