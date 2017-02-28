package com.sample.biz;

import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

public interface RainWaterBiz {
	/**
	  * 查询采样记录并分页
	  * @param commonPage
	  * @return CommonResult
	  */
	 public CommonResult getCYRecordByPage(CommonPage commonPage);
	 
	 
	 /**
	  * 查询实时数据并分页
	  * @param commonPage
	  * @return CommonResult
	  */
	 public CommonResult getSSDataByPage(CommonPage commonPage);
}
