package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Enterprise;

/**
 * Created by Skeyedu on 2017/1/19.
 */
public interface EnterpriseService {
    public  boolean editEnterprise(Enterprise enterprise);

    //删除企业,
    public  boolean deleteEnterprise(List<String> ids, String tenantNo);

    public  List<Map<String, Object>>  selectByMap(Map<String,Object> map);

    public List<Enterprise> getEnterpriseByBlockNo (String blockNo, String tenantNo);

}
