package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.sample.bean.EnterpriseBean;
import com.sample.biz.EnterpriseBiz;
import com.sample.service.EnterpriseService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

import java.util.List;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Service
public class EnterpriseBizImpl implements EnterpriseBiz {

    @Autowired  private EnterpriseService enterpriseService;
    private static Logger logger = Logger.getLogger(EnterpriseBizImpl.class);
    @Autowired private TransactionTemplate transactionTemplate;
    //tenantNo可以为登录后session中获取的编号 也可以为超级管理员管理的其他租户的编号
    @Override
    public CommonResult editEnterprise(EnterpriseBean enterprise, String tenantNo) {
        CommonResult result=new CommonResult();
        try{
            enterprise.setTenantNo(tenantNo);
            //result.setIsSuccess(enterpriseService.editEnterprise(enterprise));
        }catch (Exception e){
            logger.error("编辑企业异常",e);
        }
        return result;
    }

    @Override
    public CommonResult getEnterpriseByPage(CommonPage commonPage) {
        CommonResult result=new CommonResult();
        try{
            //commonPage.setPageData(  enterpriseService.selectByMap(commonPage.pageToMap()));
            result.setIsSuccess(true);
        }catch (Exception e){
            logger.error("查询企业列表异常",e);
        }
        return result;
    }

    //tenantNo可以为登录后session中获取的编号 也可以为超级管理员管理的其他租户的编号
    @Override
    public CommonResult deleteEnterprise(List<String> ids, String tenantNo) {
        CommonResult result=new CommonResult();
        try{
            boolean success=
            transactionTemplate.execute( new TransactionCallback<Boolean>(){
                @Override
                public Boolean doInTransaction(TransactionStatus status) {
                    boolean success=true;



                    return success;
                }
            });

            //result.setIsSuccess(enterpriseService.deleteEnterprise(ids, tenantNo));
        }catch (Exception e){
            logger.error("删除企业异常",e);
        }
        return result;
    }

    @Override
    public CommonResult getEnterpriseByBlockNo(String blockNo, String tenantNo) {
        return null;
    }


    public  EnterpriseBean getEnterpriseById(Integer enterpriseNo, String tenantNo){
    	/*
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("enterpriseNo",enterpriseNo);
        map.put("tenantNo",tenantNo);
        List<EnterpriseBean>  beans=  enterpriseService.selectByMap(map);
        if(beans!=null&&beans.size()==1){
            return  beans.get(0);
        }
        */
       return null;
    }
}
