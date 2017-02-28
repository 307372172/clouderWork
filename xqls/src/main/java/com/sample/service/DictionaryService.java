package com.sample.service;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Dictionary;
import com.sample.dal.model.DictionaryWithChildren;

public interface DictionaryService {

    public boolean addDictionary(Dictionary dictionary);

    public boolean editDictionary(Dictionary dictionary);

    public List<Dictionary> queryDictionaryByPage(Map<String, Object> map);

    public List<Dictionary> queryDictionaryByParentId( String tenantNo,Integer parentId);

    public Dictionary queryDictionaryById( String tenantNo,Integer id);

    public List<Dictionary> queryAllDictionary(String tenantNo);

    public List<DictionaryWithChildren> queryDictionaryWithChildren(Map<String, Object> map);

    public boolean deleteDictionary( String tenantNo,Integer ids);
}