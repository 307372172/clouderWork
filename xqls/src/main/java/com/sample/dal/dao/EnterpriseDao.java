package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Enterprise;
import com.sample.dal.model.EnterpriseExample;

/**
 * Created by Skeyedu on 2017/1/19.
 * 添加企业,修改企业,删除企业,根据区块编号查询企业
 */
public interface EnterpriseDao {

    public  boolean addEnterprise(Enterprise enterprise);


    public  boolean updateEnterprise(Enterprise enterprise);


    public  boolean deleteEnterprise( EnterpriseExample example);


    public  List<Map<String, Object>> selectByMap(Map<String,Object> map );

    public List<Enterprise> getEnterprise ( EnterpriseExample example);


}
