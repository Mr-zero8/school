package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.fayan;

public interface fayanMapper {
	
public List<fayan> selectALLfayan();
//举报该层
public void jubao(int id);
}
