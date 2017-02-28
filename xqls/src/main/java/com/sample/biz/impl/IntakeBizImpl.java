package com.sample.biz.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sample.biz.IntakeBiz;
import com.sample.dal.model.Intake;
import com.sample.service.IntakeService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class IntakeBizImpl implements IntakeBiz{
	@Resource(name="intakeservice")
	private IntakeService iService;
	private static Logger logger = Logger.getLogger(IntakeBiz.class);
	
	@Override
	public int deleteByPrimaryKey(String record_id) {
		return iService.deleteByPrimaryKey(record_id);
	}

	@Override
	public int insert(Intake record) {
		return iService.insert(record);
	}

	@Override
	public int insertSelective(Intake record) {
		return iService.insertSelective(record);
	}

	@Override
	public Intake selectByPrimaryKey(String record_id) {
		return iService.selectByPrimaryKey(record_id);
	}

	@Override
	public int updateByPrimaryKeySelective(Intake record) {
		return iService.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Intake record) {
		return iService.updateByPrimaryKey(record);
	}

	@Override
	public List<Map<String, Object>> selectByRecordDate(Map<String, Object> time) {
		return iService.selectByRecordDate(time);
	}

	@Override
	public CommonResult selectDataByBlock(CommonPage commonPage) {
		CommonResult result=new CommonResult();
        try{
            commonPage.setPageData(iService.selectDataByBlock(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("查询取水口列表异常",e);
        }
        return result;
	}

	@Override
	public CommonResult selectFlowrateRecordData(CommonPage commonPage) {
		return null;
	}

}
