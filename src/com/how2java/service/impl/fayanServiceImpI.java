package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.fayanMapper;
import com.how2java.pojo.fayan;
import com.how2java.service.fayanService;
@Service
public class fayanServiceImpI implements fayanService{

	@Autowired
	fayanMapper fayan1;
	@Override
	public List<fayan> selectALLfayan() {
		// TODO Auto-generated method stub
		return fayan1.selectALLfayan();
	}
	@Override
	public void jubao(int id) {
		
		fayan1.jubao(id);
	}
	@Override
	public List<fayan> chuli() {
		// TODO Auto-generated method stub
		return fayan1.chuli();
	}
	@Override
	public void pingbifayan(String a, int b) {
		// TODO Auto-generated method stub
		fayan1.pingbifayan(a, b);
		
	}
	@Override
	public List<fayan> reported() {
		// TODO Auto-generated method stub
		return fayan1.reported();
	}


}
