package com.sample.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.biz.BlockBiz;
import com.sample.dal.model.Block;
import com.sample.service.BlockService;

@Service
public class BlockBizImpl implements BlockBiz{
	@Autowired
	private BlockService bService;
	/*@Override
	public int insert(Block record) {
		return bService.insert(record);
	}

	@Override
	public int insertSelective(Block record) {
		return bService.insertSelective(record);
	}

	@Override
	public List<Object> selectAllBlock() {
		return bService.selectAllBlock();
	}
	*/

	@Override
	public int insert(Block record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Block record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object> selectAllBlock() {
		// TODO Auto-generated method stub
		return null;
	}
}
