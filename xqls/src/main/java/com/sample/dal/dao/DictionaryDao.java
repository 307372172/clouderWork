package com.sample.dal.dao;

import java.util.List;
import java.util.Map;

import com.sample.dal.model.Dictionary;
import com.sample.dal.model.DictionaryExample;
import com.sample.dal.model.DictionaryWithChildren;

public interface DictionaryDao {

	public boolean addDictionary(Dictionary dictionary);

	public boolean editDictionary(Dictionary dictionary);

	public List<Dictionary> queryDictionaryByPage(Map<String, Object> map);

	public List<Dictionary>  queryDictionary(DictionaryExample example);

	public List<DictionaryWithChildren> queryDictionaryWithChildren(Map<String, Object> map);

	public boolean deleteDictionary(String tntId,Integer id) ;


}