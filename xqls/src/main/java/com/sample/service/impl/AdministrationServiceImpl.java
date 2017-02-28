package com.sample.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.AdministrationBean;
import com.sample.dal.dao.AdministrationDao;
import com.sample.dal.model.Administration;
import com.sample.service.AdministrationService;
import com.sample.util.ObjectUtil;

@Service
public class AdministrationServiceImpl implements AdministrationService{
	
	
	@Autowired private AdministrationDao administrationDao;
	
	public List<Map<String, Object>> selectByMap(Map<String, Object> map){
		return administrationDao.selectByMap(map);
	}
	
	public AdministrationBean  selectByTableno(String tableno){
		return (AdministrationBean) ObjectUtil.transfer(administrationDao.selectByTableno(tableno), AdministrationBean.class);
	}
	
	public boolean updateAdministration(AdministrationBean administrationBean){
		Administration administration= (Administration) ObjectUtil.transfer(administrationBean, Administration.class);
		
		return administrationDao.updateAdministration(administration);
	}
	
	public boolean addFiled(String tablename,String filed, String type) {
		return administrationDao.addFile( tablename,filed, type);
	}
	
	public List<Administration> selectByTablename(String tablename){
		return administrationDao.selectByTablename(tablename);
	}

}
