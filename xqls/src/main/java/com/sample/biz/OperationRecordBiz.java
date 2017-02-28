package com.sample.biz;

import com.sample.bean.OperationRecordBean;
import com.sample.util.CommonResult;

/**
 * Created by xiaoxu on 2017/2/8.
 */
public interface OperationRecordBiz {
	//保存记录
	public CommonResult addOperation_record(OperationRecordBean operation_record);
	//查询记录
	public CommonResult Operation_record(OperationRecordBean operation_record);

}
