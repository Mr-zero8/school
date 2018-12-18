package com.how2java.pojo;

public class Talk {
	private int id;
	private String title;
	private int talkcount;
	private String author;
	private int starttime;
	private int updatetime;

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

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(int updatetime) {
		this.updatetime = updatetime;
	}

}
