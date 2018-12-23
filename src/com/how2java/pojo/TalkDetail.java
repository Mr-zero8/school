package com.how2java.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TalkDetail {
	private int id;
	private int sort;
	private String authorname;
	private String authorphoto;
	private String authortext;
	private String writetime;
	private String img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthorphoto() {
		return authorphoto;
	}

	public void setAuthorphoto(String authorphoto) {
		this.authorphoto = authorphoto;
	}

	public String getAuthortext() {
		return authortext;
	}

	public void setAuthortext(String authortext) {
		this.authortext = authortext;
	}

	public String getWritetime() {
		return writetime;
	}

	public void setWritetime(String writetime) {
		int i = Integer.parseInt(writetime);
		long l = i * 1000L;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");// 这个是你要转成后的时间的格式
		writetime = sdf.format(new Date(l)); // 时间戳转换成时间

		this.writetime = writetime;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
