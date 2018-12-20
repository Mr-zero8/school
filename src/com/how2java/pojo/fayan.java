package com.how2java.pojo;

public class fayan {
private int userid;
private String text;
private int id;
private boolean report;
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

public boolean isReport() {
	return report;
}
public void setReport(boolean report) {
	this.report = report;
}
@Override
public String toString() {
	return "fayan [userid=" + userid + ", text=" + text + ", id=" + id + "]";
}


}
