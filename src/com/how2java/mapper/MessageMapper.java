package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.Message;

public interface MessageMapper {
	 //插入私信
   public int insertMessage(Message a);

   //查询个人私信
   public List<Message> selectAllmessageByid(int jieUserID);

}
