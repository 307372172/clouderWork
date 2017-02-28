package com.sample.biz;

import com.sample.bean.RealdataBean;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

public interface RealdataBiz {
	
	CommonResult insertRealdata(RealdataBean realdataBean);
	
	CommonResult addFiled(String filed,Object type);
	
	CommonResult queryRealdata(CommonPage commonPage);

}
