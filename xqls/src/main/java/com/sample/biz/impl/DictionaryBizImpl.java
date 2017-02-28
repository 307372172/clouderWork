package com.sample.biz.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.bean.DictionaryBean;
import com.sample.biz.DictionaryBiz;
import com.sample.dal.model.Dictionary;
import com.sample.dal.model.DictionaryWithChildren;
import com.sample.redis.RedisCache;
import com.sample.service.DictionaryService;
import com.sample.util.ObjectUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Skeyedu on 2016/12/15.
 */
@Service
public class DictionaryBizImpl implements DictionaryBiz {
    private  static  final  String  ALLDICTIONARY="ALLDICTIONARY";
    private  static  final  String  DICTIONARYWITHCHILDREN="DICTIONARYWITHCHILDREN";

    private static Logger logger = Logger.getLogger(DictionaryBizImpl.class);
    @Autowired
    private RedisCache<String, Object> redisCache;

    @Autowired
    private DictionaryService dictionaryService;

    @Override
    public boolean editDictionary(DictionaryBean dictionary) {
        boolean success=false ;
       try{
           if (dictionary.getDictionaryKey()!=null){
               success= dictionaryService.editDictionary((Dictionary) ObjectUtil.transfer(dictionary,Dictionary.class));
           }else {
               success= dictionaryService.addDictionary((Dictionary)ObjectUtil.transfer(dictionary,Dictionary.class));
           }
           if(success){
               clear(dictionary.getTenantNo());
           }
       }catch (Exception e){
           logger.error("修改字典异常",e);
       }

        return success;
    }

    @Override
    public Map<Integer, String> queryDictionaryByParent(String tenantNo,Integer parent) {
        Map<Integer, Map<Integer, String>> data= queryDictionaryWithChildren(tenantNo);
        if (data==null) return null;
        return data.get(parent);
    }

    @Override
    public Map<Integer, Map<Integer, String>> queryDictionaryWithChildren(String tenantNo) {
        Map<Integer, Map<Integer, String>> data=null;
        try{
       data=  ( Map<Integer, Map<Integer, String>>)redisCache.get(tenantNo+DICTIONARYWITHCHILDREN);
          if (data==null||data.size()==0){
              Map<String, Object> map=new HashMap<String, Object>();
              map.put("tenantNo",tenantNo);
                List<DictionaryWithChildren> dictionaryWithChildrens=    dictionaryService.queryDictionaryWithChildren(map);
              if(dictionaryWithChildrens!=null&&dictionaryWithChildrens.size()>0){
                  data=new HashMap<Integer, Map<Integer, String>> ();
                  for (DictionaryWithChildren dictionaryWithChildren:dictionaryWithChildrens){
                      data.put(dictionaryWithChildren.getDictionaryKey(),dictionaryToMap(dictionaryWithChildren.getChildren()));
                  }
                  redisCache.put(tenantNo+DICTIONARYWITHCHILDREN,data);
              }
          }
        }catch (Exception e){
            logger.error("查询字典异常",e);
        }
        return data;
    }



    @Override
    public boolean deleteDictionary(String tenantNo,Integer ids) {
        boolean success=false;
        try{
            Dictionary dictionary= dictionaryService.queryDictionaryById(tenantNo,ids);
            if(!dictionary.getRemoveAble()){
                return  false;
            }
                success=dictionaryService.deleteDictionary(tenantNo,ids);
                if(success){
                    clear(tenantNo);
                }
        }catch (Exception e){
            logger.error("删除字典异常",e);
        }
        return success;
    }

    @Override
    public List<DictionaryBean> queryAllDictionary(String tenantNo) {
        List<DictionaryBean> data=null;
        try{
        data=(List<DictionaryBean>)redisCache.get(tenantNo+ALLDICTIONARY);
        if (data==null||data.size()==0){
            List<Dictionary> dictionaries=dictionaryService.queryAllDictionary(tenantNo);
            if(dictionaries!=null&&dictionaries.size()>0){
                data=ObjectUtil.transferList(dictionaries,DictionaryBean.class);
                redisCache.put(tenantNo+ALLDICTIONARY,data);
            }
        }
        }catch (Exception e){
            logger.error("查询所有字典异常",e);
        }
        return data;

    }

    private void  clear(String tenantNo){
        redisCache.put(tenantNo+DICTIONARYWITHCHILDREN,null);
        redisCache.put(tenantNo+ALLDICTIONARY,null);
    }



    private  Map<Integer,String> dictionaryToMap( List<Dictionary> list){
        Map<Integer,String>  map=new HashMap<Integer,String>();
        if (list==null||list.size()==0)return map;
        for (Dictionary dictionary:list){
            map.put(dictionary.getDictionaryKey(),dictionary.getDictionaryValue());
        }
        return map;
    }
}
