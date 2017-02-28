package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sample.dal.model.Recontrol;
import com.sample.dal.model.RecontrolExample;

public interface RecontrolMapper {
    int countByExample(RecontrolExample example);

    int deleteByExample(RecontrolExample example);

    int deleteByPrimaryKey(String recontrolNo);

    int insert(Recontrol record);

    int insertSelective(Recontrol record);

    List<Recontrol> selectByExample(RecontrolExample example);

    Recontrol selectByPrimaryKey(String recontrolNo);

    int updateByExampleSelective(@Param("record") Recontrol record, @Param("example") RecontrolExample example);

    int updateByExample(@Param("record") Recontrol record, @Param("example") RecontrolExample example);

    int updateByPrimaryKeySelective(Recontrol record);

    int updateByPrimaryKey(Recontrol record);
    
    List<Map<String,Object>> selectByMap(Map<String,Object> map);
}