package com.how2java.service;

import java.util.List;

import com.how2java.pojo.fayan;

public interface fayanService {
	public  List<fayan> selectALLfayan();
	
	public void jubao(int id);
	
	public List<fayan> chuli();
	
	public void pingbifayan(String a,int b);
	
	public List<fayan> reported();
}