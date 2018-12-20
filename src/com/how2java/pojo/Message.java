package com.how2java.pojo;

public class Message {
private int id;
private int faUserID;
private int jieUserID;
private String text;
private String Image;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getFaUserID() {
	return faUserID;
}
public void setFaUserID(int faUserID) {
	this.faUserID = faUserID;
}
public int getJieUserID() {
	return jieUserID;
}
public void setJieUserID(int jieUserID) {
	this.jieUserID = jieUserID;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getImage() {
	return Image;
}
public void setImage(String image) {
	Image = image;
}
@Override
public String toString() {
	return "Message [id=" + id + ", faUserID=" + faUserID + ", jieUserID=" + jieUserID + ", text=" + text + ", Image="
			+ Image + "]";
}


}
