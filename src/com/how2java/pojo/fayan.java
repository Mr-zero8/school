package com.how2java.pojo;

public class fayan {
private int userid;
private String text;
private int id;
private int reported;
private String image;

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
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}


public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
@Override
public String toString() {
	return "fayan [userid=" + userid + ", text=" + text + ", id=" + id + "]";
}


}