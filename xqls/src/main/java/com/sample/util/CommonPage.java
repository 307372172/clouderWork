package com.sample.util;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonPage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7941149355570542666L;
	public Integer sEcho;//请求次数
	public Integer iDisplayLength; //每页条数
	public Integer iDisplayStart;//起始条数

	public Integer iTotalRecords;
	//public Integer totalPage;

	public String params ;

	public String tableFiled;//优化的主键
	public String tableName;//优化的查询分页表名称
	public String tableAglisName;// 表别名

	private  Map<String,Object> paramsMap=null;

	public String getTableAglisName() {
		return tableAglisName;
	}

	public void setTableAglisName(String tableAglisName) {
		this.tableAglisName = tableAglisName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableFiled() {
		return tableFiled;
	}

	public void setTableFiled(String tableFiled) {
		this.tableFiled = tableFiled;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Object pageData;
	public static Integer DEFAULT_PAGESIZE = 10;

	public CommonPage() {

	}

	public Integer getsEcho() {
		return sEcho;
	}

	public void setsEcho(Integer sEcho) {
		this.sEcho = sEcho;
	}

	public Integer getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(Integer totalRecord) {
		this.iTotalRecords = totalRecord;
	}

//	public Integer getTotalPage() {
//		return totalPage;
//	}
//
//	public void setTotalPage(Integer totalPage) {
//		this.totalPage = totalPage;
//	}

	public Object getPageData() {
		return pageData;
	}

	public void setPageData(Object pageData) {
		this.pageData = pageData;
	}


	public Integer getiDisplayLength() {
		if(iDisplayLength ==null) return DEFAULT_PAGESIZE;
		return iDisplayLength;
	}

	public void setiDisplayLength(Integer iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}

	public Integer getiDisplayStart() {
		if(iDisplayStart ==null) return 0;
		return iDisplayStart;
	}

	public void setiDisplayStart(Integer iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	//	public String getOrder() {
//		return order;
//	}
//
//	public void setOrder(String order) {
//		this.order = order;
//	}
    
	/**
	 * 
	 * @param
	 * @return
	 */
	public Map<String, Object> pageToMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", this);
		String params = this.getParams();
		if (params!=null&&!params.equals("")) {
			try {
				Map<String, Object> paramsMap = JSONObject.parseObject(params);
				map.putAll(paramsMap);
			} catch (Exception e) {
			}
		}
		return map;
	}

	public boolean containParam(String paramKey){
		String params = this.getParams();
		if (params!=null&&!params.equals("")) {
			try {
				Map<String, Object> paramsMap = JSONObject.parseObject(params);
               return paramsMap.containsKey(paramKey);
			} catch (Exception e) {
				return false;
			}
		}else {
			return  false;
		}

	}

	private Map<String, Object>  getParamsMap(){

		if (paramsMap==null){
			if (params!=null&&!params.equals("")) {
				try {
			  paramsMap = JSONObject.parseObject(params);
					return paramsMap;
				} catch (Exception e) {
					return null;
				}
			} else {
				return null;
			}
		}else {
			return  paramsMap;
		}
	}
	public String getParam(String paramKey) {
		if (getParamsMap()!=null ) {
				return (String) getParamsMap().get(paramKey);
		} else {
			return null;
		}
	}
	public String setParam(String paramKey,Object value) {
		if (getParamsMap()!=null ) {
			return (String) getParamsMap().put(paramKey,value);
		} else {
			return null;
		}
	}


	public JSONObject toSHowPage(){
		JSONObject getObj = new JSONObject();
		getObj.put("sEcho", sEcho);// 不知道这个值有什么用,有知道的请告知一下
		getObj.put("iTotalRecords", iTotalRecords);//实际的行数
		getObj.put("iTotalDisplayRecords", iTotalRecords);//显示的行数,这个要和上面写的一样
       if(pageData!=null){
		   getObj.put("aaData", pageData);//要以JSON格式返回
	   }else {
		   getObj.put("aaData", new ArrayList());//要以JSON格式返回
	   }


		return getObj;
	}
/**
 * 
 * @param columns_name 要在页面表格中显示的字段
 * @param columns 页面表格中显示的字段对应数据中的字段
 * @param url 页面数据url请求地址
 * @return
 */
	public static Map<String, Object> setColumnToPage(String[] columns_name,Object[] columns,String url){
		Map<String, Object> map_columns = new HashMap<String, Object>();
		Map<String, Object> map_url = new HashMap<String, Object>();
		map_url.put("url", url);
		for(int i=0;i<columns.length;i++){
			map_columns.put(columns_name[i], columns[i]);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("url", map_url);
		map.put("columns", map_columns);
		return map;
	}
/**
 * 
 * @param id 树节点数据的id字段
 * @param text 要显示在前端的字段，和传入后台的数据字段名相同
 * @param pid 树节点数据的父id字段
 * @param url 获取树节点数据的url请求地址
 * @return
 */
	public static Map<String, Object> setTreeToPage(String id,String text,String pid,String url){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("text", text);
		map.put("pid", pid);
		map.put("url", url);
		return map;
	}
	
}
