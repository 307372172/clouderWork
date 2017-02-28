package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.biz.RainWaterBiz;
import com.sample.service.CyRecordService;
import com.sample.service.SSDataService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class RainWaterBizImpl implements RainWaterBiz {
	@Autowired private CyRecordService cyrecrodservice;
	@Autowired private SSDataService ssdataservice;
	 private static Logger logger = Logger.getLogger(RainWaterBizImpl.class);
	@Override
	public CommonResult getCYRecordByPage(CommonPage commonPage) {
		CommonResult result=new CommonResult();
        try{
            commonPage.setPageData(  cyrecrodservice.selectByMap(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("查询企业列表异常",e);
        }
        return result;
	}
	@Override
	public CommonResult getSSDataByPage(CommonPage commonPage) {
		CommonResult result=new CommonResult();
        try{
            commonPage.setPageData(  ssdataservice.selectByMap(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("查询企业列表异常",e);
        }
        return result;
	}
}
