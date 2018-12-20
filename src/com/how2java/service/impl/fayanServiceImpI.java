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

}
