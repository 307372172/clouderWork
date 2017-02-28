package com.sample.biz;

import java.util.List;

import com.sample.bean.BlockBean;
import com.sample.bean.EnterpriseBean;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;


public interface FlowBiz {
	
	public CommonResult getFlowByPage(CommonPage commonPage);
	
	public  List<EnterpriseBean> getEnterpriseByBlockNo(String blockNo,String tenantNo);
	
	public List<BlockBean> getAllBlock(String tenantNo);
}
