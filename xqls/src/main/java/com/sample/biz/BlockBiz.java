package com.sample.biz;

import java.util.List;

import com.sample.dal.model.Block;

public interface BlockBiz {
	int insert(Block record);

    int insertSelective(Block record);
    
    List<Object> selectAllBlock();
}
