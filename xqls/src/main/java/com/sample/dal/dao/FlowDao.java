package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Flow;

public interface FlowDao {
    int deleteByPrimaryKey(String flowNo);

    boolean insert(Flow record);

    int insertSelective(Flow record);

    List<Map<String,Object>> selectByEnterprise(Map<String,Object> map);

    int updateByPrimaryKeySelective(Flow record);

    int updateByPrimaryKey(Flow record);
}