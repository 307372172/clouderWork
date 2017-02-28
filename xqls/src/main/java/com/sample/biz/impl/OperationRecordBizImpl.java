package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.OperationRecordBean;
import com.sample.biz.OperationRecordBiz;
import com.sample.service.OperationRecordService;
import com.sample.util.CommonResult;


/**
 * Created by xiaoxu on 2017/2/8.
 */
@Service
public class OperationRecordBizImpl implements OperationRecordBiz {

	@Autowired
	private OperationRecordService operation_recordService;
	private static Logger logger = Logger.getLogger(OperationRecordBizImpl.class);

	@Override
	public CommonResult addOperation_record(OperationRecordBean operation_record) {
		CommonResult result = new CommonResult();
		try{
		//result.setIsSuccess(operation_recordService.addOperationRecord(operation_record));
		}catch (Exception e){
            logger.error("保存记录异常",e);
        }
		return result;
	}

	@Override
	public CommonResult Operation_record(OperationRecordBean operation_record) {
		// TODO Auto-generated method stub
		return null;
	}


}
