package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.biz.RecontrolBiz;
import com.sample.service.RecontrolService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class RecontrolBizImpl implements RecontrolBiz {
	@Autowired private RecontrolService recontrolservice;
	 private static Logger logger = Logger.getLogger(RecontrolBizImpl.class);
	@Override
	public CommonResult getRecontrolByPage(CommonPage commonPage) {
		CommonResult result=new CommonResult();
        try{
            commonPage.setPageData(  recontrolservice.selectByMap(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("远程控制查询异常",e);
        }
        return result;
	}

}
