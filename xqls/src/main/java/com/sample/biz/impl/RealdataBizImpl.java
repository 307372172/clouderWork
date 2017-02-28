package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.RealdataBean;
import com.sample.biz.RealdataBiz;
import com.sample.service.RealdataService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class RealdataBizImpl implements RealdataBiz{
	private static Logger logger = Logger.getLogger(RealdataBiz.class);
	@Autowired private RealdataService realdataService;
	@Override
	public CommonResult insertRealdata(RealdataBean realdataBean) {
		CommonResult commonResult=new CommonResult();
		boolean success=false;
		try {
			//success=realdataService.insertRealdata(realdataBean);
		} catch (Exception e) {
			logger.error("数据添加异常",e);
		}
		commonResult.setIsSuccess(success);
		return commonResult;
	}

	@Override
	public CommonResult addFiled(String filed, Object type) {
		CommonResult commonResult=new CommonResult();
		boolean success=false;
		try {
			success=realdataService.addFiled(filed, type);
		} catch (Exception e) {
			logger.error("添加字段异常",e);
		}
		commonResult.setIsSuccess(success);
		return commonResult;
	}

	@Override
	public CommonResult queryRealdata(CommonPage commonPage) {
		CommonResult commonResult=new CommonResult();
		
		try {
			commonPage.setPageData(  realdataService.selectByMap(commonPage.pageToMap()));
			commonResult.setIsSuccess(true);
		} catch (Exception e) {
			logger.error("实时数据列表异常",e);
		}
		
		return commonResult;
		
	}

}
