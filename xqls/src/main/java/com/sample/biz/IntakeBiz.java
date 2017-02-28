package com.sample.biz;

import java.util.List;

import java.util.Map;

import com.sample.dal.model.Intake;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;


public interface IntakeBiz {
	int deleteByPrimaryKey(String record_id);

    int insert(Intake record);

    int insertSelective(Intake record);

    Intake selectByPrimaryKey(String record_id);

    int updateByPrimaryKeySelective(Intake record);

    int updateByPrimaryKey(Intake record);
    
    List<Map<String, Object>> selectByRecordDate(Map<String, Object> time);
    
    CommonResult selectDataByBlock(CommonPage commonPage);
    
    CommonResult selectFlowrateRecordData(CommonPage commonPage);
}
