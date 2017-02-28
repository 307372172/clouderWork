package com.sample.biz.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.BlockBean;
import com.sample.bean.EnterpriseBean;
import com.sample.biz.FlowBiz;
import com.sample.service.BlockService;
import com.sample.service.EnterpriseService;
import com.sample.service.FlowService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Service
public class FlowBizImpl implements FlowBiz {
	
	@Autowired private FlowService flowService;
	@Autowired private EnterpriseService enterpriseService; 
	@Autowired private BlockService blockService;
	
	private static Logger logger = Logger.getLogger(FlowBizImpl.class);
	
	@Override
	public CommonResult getFlowByPage(CommonPage commonPage) {
		// TODO Auto-generated method stub
		CommonResult result=new CommonResult();
        try{
            commonPage.setPageData(  flowService.selByEnterprise(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("查询流量列表异常",e);
        }
        return result;
	}

	@Override
	public  List<EnterpriseBean> getEnterpriseByBlockNo(String blockNo,String tenantNo) {
		return null;//enterpriseService.getEnterpriseByBlockNo(blockNo,tenantNo);
	}

	@Override
	public List<BlockBean> getAllBlock(String tenantNo) {
		return null;//ObjectUtil.transferList(blockService.getAllBlock( ), BlockBean.class);
	}

}
