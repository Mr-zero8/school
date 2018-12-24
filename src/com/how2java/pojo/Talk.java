package com.how2java.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Talk {
	private int id;
	private String title;
	private int talkcount;
	private String author;
	private String starttime;
	private String updatetime;
	private int schoolid;
	private int reported;
	private String img;
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getReported() {
		return reported;
	}

	public void setReported(int reported) {
		this.reported = reported;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTalkcount() {
		return talkcount;
	}

	public void setTalkcount(int talkcount) {
		this.talkcount = talkcount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		int i = Integer.parseInt(updatetime);
		long l = i * 1000L;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");// 这个是你要转成后的时间的格式
		updatetime = sdf.format(new Date(l)); // 时间戳转换成时间
		this.updatetime = updatetime;
	}

	public int getSchoolid() {
		return schoolid;
	}

	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}

}

