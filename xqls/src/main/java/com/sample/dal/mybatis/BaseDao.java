package com.sample.dal.mybatis;

/**
 * Created by Skeyedu on 2017/2/9.
 */
public class BaseDao {
    protected  boolean getResultByInt(int rows){
        return rows>0?true:false;
    }
}
