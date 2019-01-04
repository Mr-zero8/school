package com.how2java.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class userlike {
private int id;
private int userid;
private int talkid;
private int talkdetailid;
private int likecount;
private boolean updatestate;
private String lastupdate;
private String title;
private int schoolid;

public int getSchoolid() {
	return schoolid;
}
public void setSchoolid(int schoolid) {
	this.schoolid = schoolid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getTalkid() {
	return talkid;
}
public void setTalkid(int talkid) {
	this.talkid = talkid;
}
public int getTalkdetailid() {
	return talkdetailid;
}
public void setTalkdetailid(int talkdetailid) {
	this.talkdetailid = talkdetailid;
}
public int getLikecount() {
	return likecount;
}
public void setLikecount(int likecount) {
	this.likecount = likecount;
}
public boolean isUpdatestate() {
	return updatestate;
}
public void setUpdatestate(boolean updatestate) {
	this.updatestate = updatestate;
}
public String getLastupdate() {
	return lastupdate;
}
public void setLastupdate(String lastupdate) {
	int i = Integer.parseInt(lastupdate);
	long l = i * 1000L;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");// 这个是你要转成后的时间的格式
	lastupdate = sdf.format(new Date(l)); // 时间戳转换成时间

	this.lastupdate = lastupdate;
}



}
