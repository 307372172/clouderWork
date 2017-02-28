package com.sample.dal.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.BlockDao;
import com.sample.dal.model.Block;
import com.sample.dal.model.BlockExample;
import com.sample.dal.service.BlockMapper;

import java.util.List;

/**
 * Created by Skeyedu on 2017/1/22.
 */
@Repository
public class BlockDaoImpl  implements BlockDao {

  @Autowired  private BlockMapper blockMapper;
    @Override
    public List<Block> queryAllBlock() {
    	
        return blockMapper.selectByExample(new BlockExample());
    }
}
