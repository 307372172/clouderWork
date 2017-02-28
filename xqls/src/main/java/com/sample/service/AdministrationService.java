package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.bean.AdministrationBean;
import com.sample.dal.model.Administration;

public interface AdministrationService {
	
	
	public List<Map<String, Object>> selectByMap(Map<String, Object> map);
	
	public AdministrationBean  selectByTableno(String tableno);
	
	public boolean updateAdministration(AdministrationBean administrationBean);
	
	public boolean addFiled(String tablename,String filed, String type);
	
	public List<Administration> selectByTablename(String tablename);
}
