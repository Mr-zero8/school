package com.how2java.mapper;

import java.util.List;

import com.how2java.pojo.fayan;

public interface fayanMapper {
	
public List<fayan> selectALLfayan();
//举报该层
public void jubao(int id);
//展示被举报的评论
public List<fayan> chuli();
//屏蔽违规发言
public void pingbifayan(String a,int b);
//已经处理的举报
public List<fayan> reported();
}
