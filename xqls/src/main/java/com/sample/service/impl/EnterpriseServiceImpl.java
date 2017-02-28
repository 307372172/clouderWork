package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.EnterpriseDao;
import com.sample.dal.model.Enterprise;
import com.sample.dal.model.EnterpriseExample;
import com.sample.service.EnterpriseService;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired private EnterpriseDao enterpriseDao;
    @Override
    public boolean editEnterprise(Enterprise enterprise) {
     
        if (enterprise.getEnterpriseNo()==null){
            enterprise.setEnterpriseNo(""+new Date().getTime()); //todo  mycat生成后注释
            return  enterpriseDao.addEnterprise(enterprise);
        }else{

            return  enterpriseDao.updateEnterprise(enterprise);
        }
    }

    @Override
    public boolean deleteEnterprise(List<String> ids, String tenantNo) {
        EnterpriseExample example=new EnterpriseExample();
        example.createCriteria().andEnterpriseNoIn(ids).andTenantNoEqualTo(tenantNo);
        return enterpriseDao.deleteEnterprise(example);
    }

    @Override
    public  List<Map<String, Object>>  selectByMap(Map<String, Object> map) {
        return  enterpriseDao.selectByMap(map);
    }

    @Override
    public List<Enterprise> getEnterpriseByBlockNo(String blockNo, String tenantNo) {
              EnterpriseExample example=new EnterpriseExample();
       example.createCriteria().andBlockNoLike(blockNo+"%").andTenantNoEqualTo(tenantNo);
        return  enterpriseDao.getEnterprise(example);
    }
}
