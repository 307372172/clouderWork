package com.sample.biz;

import java.util.List;
import java.util.Map;

import com.sample.bean.DictionaryBean;

public interface DictionaryBiz {

    public boolean editDictionary(DictionaryBean dictionary);

    public Map<Integer,String> queryDictionaryByParent(String tenantNo,Integer parent);

    public Map<Integer,Map<Integer, String>> queryDictionaryWithChildren(String tenantNo);

    public boolean deleteDictionary(String tenantNo,Integer ids);

    public List<DictionaryBean> queryAllDictionary(String tenantNo);
}