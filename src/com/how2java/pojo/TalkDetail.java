package com.how2java.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TalkDetail {
	private int id;
	private int talkid;
	private float sort;
	private String authorname;
	private String authorphoto;
	private String authortext;
	private String writetime;
	private String img;

	public TalkDetail() {
	}

	public int getId() {
		return id;
	}

	public float getSort() {
		// if (sort % 1 != 0) {
		// return ((int) (sort * 100) - (int) sort * 100);
		// } else {
		// return (int) (sort);
		// }
		return sort;
	}

	public void setSort(float sort) {
		this.sort = sort;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTalkid() {
		return talkid;
	}

	public void setTalkid(int talkid) {
		this.talkid = talkid;
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
