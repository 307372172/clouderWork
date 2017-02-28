package com.sample.dal.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sample.dal.model.Role;
import com.sample.dal.model.RoleExample;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Map<String,Object>> selectByMap(Map<String,Object> map);
}