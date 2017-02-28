package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dal.dao.DictionaryDao;
import com.sample.dal.model.Dictionary;
import com.sample.dal.model.DictionaryExample;
import com.sample.dal.model.DictionaryWithChildren;
import com.sample.service.DictionaryService;

import java.util.List;
import java.util.Map;

/**
 * Created by Skeyedu on 2016/12/15.
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired private DictionaryDao dictionaryDao;
    @Override
    public boolean addDictionary(Dictionary dictionary) {
        return dictionaryDao.addDictionary(dictionary);
    }

    @Override
    public boolean editDictionary(Dictionary dictionary) {
        return dictionaryDao.editDictionary(dictionary);
    }

    @Override
    public List<Dictionary> queryDictionaryByPage(Map<String, Object> map) {
        return dictionaryDao.queryDictionaryByPage(map);
    }

    @Override
    public List<Dictionary> queryDictionaryByParentId( String tenantNo,Integer parentId) {
        DictionaryExample example=new DictionaryExample();
        example.createCriteria().andParentKeyEqualTo(parentId).andTenantNoEqualTo(tenantNo);
        return dictionaryDao.queryDictionary(example);
    }

    @Override
    public Dictionary queryDictionaryById( String tenantNo,Integer id) {
        DictionaryExample example=new DictionaryExample();
        example.createCriteria().andDictionaryKeyEqualTo(id).andTenantNoEqualTo(tenantNo);
        return dictionaryDao.queryDictionary(example).get(0);
    }

    @Override
    public List<Dictionary> queryAllDictionary(String tenantNo) {
        DictionaryExample example=new DictionaryExample();
        example.createCriteria().andTenantNoEqualTo(tenantNo);
        return dictionaryDao.queryDictionary(example);
    }

    @Override
    public List<DictionaryWithChildren> queryDictionaryWithChildren(Map<String, Object> map) {
        return dictionaryDao.queryDictionaryWithChildren(map);
    }

    @Override
    public boolean deleteDictionary(  String tenantNo,Integer ids) {
        return dictionaryDao.deleteDictionary(tenantNo,ids);
    }
}
