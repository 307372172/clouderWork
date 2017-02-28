package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Flow;

public interface FlowMapper {
    int deleteByPrimaryKey(String flowNo);

    int insert(Flow record);

    int insertSelective(Flow record);

    List<Map<String,Object>> selectByEnterprise(Map<String,Object> map);

    int updateByPrimaryKeySelective(Flow record);

    int updateByPrimaryKey(Flow record);
}