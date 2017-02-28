package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * Created by xiaoxu on 2017/2/8.
 */
public interface RecontrolDao {
	
	//查询记录
    public  List<Map<String,Object>> selectByMap(Map<String,Object> map);
}
