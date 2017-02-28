package com.sample.biz;

import java.util.List;

import com.sample.bean.EnterpriseBean;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

/**
 * Created by Skeyedu on 2017/1/19.
 */
public interface EnterpriseBiz {

    public CommonResult editEnterprise(EnterpriseBean enterprise, String tenantNo);

    public CommonResult getEnterpriseByPage(CommonPage commonPage);

    public  CommonResult deleteEnterprise(List<String> ids, String tenantNo);

    public CommonResult  getEnterpriseByBlockNo (String blockNo, String tenantNo);

    public  EnterpriseBean getEnterpriseById(Integer enterpriseNo, String tenantNo);
}
