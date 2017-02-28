package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.model.Block;
import com.sample.dal.service.BlockMapper;
import com.sample.service.BlockService;

import java.util.List;

/**
 * Created by Skeyedu on 2017/1/22.
 */

@Service("BlockService")
public class BlockServiceImpl implements BlockService {

	@Autowired
	public BlockMapper mapper;

	@Override
	public List<Block> getAllBlock() {
		List<Block> map = (List<Block>) mapper.selectAllBlock();
		return map;
	}

	@Override
	public int addBlock(Block block) {
		int result = 0;
		Block block1 = mapper.selectByPrimaryKey(block.getBlockName());
		block1.setBlockNo(0001 + "001");
		if (block1 == null) {
			result = mapper.insert(block);
		} else {
			result = -1;
		}
		return result;
	}

	@Override
	public int delBlock(String blockName) {
		return mapper.deleteByPrimaryKey(blockName);

	}

	@Override
	public int editBlock(Block block) {
		int result = 0;
		Block block1 = mapper.selectByPrimaryKey(block.getBlockName());
		if (block1 == null) {
			result = mapper.updateByPrimaryKey(block);
		} else {
			if (block.getBlockName().equals(block1.getBlockName())) {
				result = mapper.updateByPrimaryKeySelective(block);// 选择性修改 条件修改
			} else {
				result = -1;
			}
		}
		return result;
	}

	@Override
	public Object getLastblockName() {
		return mapper.selLastblockName();
	}

	@Override
	public String doadd1Block(Block block) {
		// TODO Auto-generated method stub
		return null;
	}

}
