package com.sample.service;

import java.util.List;

import com.sample.dal.model.Block;

/**
 * Created by Skeyedu on 2017/1/22.
 */
public interface BlockService {

	public List<Block> getAllBlock();

	public int addBlock(Block block);

	public Object getLastblockName();

	public int editBlock(Block block);

	public int delBlock(String blockName);
	
	public String doadd1Block(Block block);
}
