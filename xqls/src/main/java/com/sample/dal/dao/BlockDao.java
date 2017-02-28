package com.sample.dal.dao;

import java.util.List;

import com.sample.dal.model.Block;

/**
 * Created by Skeyedu on 2017/1/22.
 */
public interface BlockDao {

    List<Block> queryAllBlock();
}
