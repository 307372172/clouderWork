package com.sample.dal.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.dal.dao.EnterpriseDao;
import com.sample.dal.model.Enterprise;
import com.sample.dal.model.EnterpriseExample;
import com.sample.dal.service.EnterpriseMapper;

import java.util.List;
import java.util.Map;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Repository
public class EnterpriseDaoImpl implements EnterpriseDao {

    @Autowired  private EnterpriseMapper enterpriseMapper;
    @Override
    public boolean addEnterprise(Enterprise enterprise) {

        return enterpriseMapper.insertSelective(enterprise)>0;
    }

    @Override
    public boolean updateEnterprise(Enterprise enterprise) {
        return enterpriseMapper.updateByPrimaryKeySelective(enterprise)>0;
    }

    @Override
    public boolean deleteEnterprise( EnterpriseExample example) {
        return enterpriseMapper.deleteByExample(example)>0;
    }

    @Override
    public  List<Map<String, Object>>  selectByMap(Map<String, Object> map ) {
        return enterpriseMapper.selectByMap(map);
    }
    //根据区块编号查询企业
    @Override
    public List<Enterprise> getEnterprise ( EnterpriseExample example) {
        return enterpriseMapper.selectByExample(example);
    }
}
