package com.sample.controller;

import com.alibaba.fastjson.JSONObject;
import com.sample.bean.DictionaryBean;
import com.sample.biz.DictionaryBiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/dictionary")
public class DictionaryController {

    @RequestMapping(value = "/index")
    public ModelAndView list() {
        ModelAndView view = new ModelAndView("dictionary/dictionaryIndex");
        return view;
    }

    @Autowired
    private DictionaryBiz dictionaryBiz;
    @RequestMapping(value = "/treeData")
    @ResponseBody
    public String treeData() {
     //todo 测试租户号去除
        return JSONObject.toJSONString(dictionaryBiz.queryAllDictionary("001"));
    }
    @RequestMapping(value = "/save")
    public @ResponseBody String save(DictionaryBean dictionaryBean) {
        dictionaryBean.setTenantNo("001");   //todo 测试租户号去除
        return JSONObject.toJSONString(dictionaryBiz.editDictionary(dictionaryBean));
    }

    @RequestMapping(value = "/delete")
    public @ResponseBody String delete(@RequestParam("id") Integer id) {
        //todo 测试租户号去除
        return JSONObject.toJSONString(dictionaryBiz.deleteDictionary("001",id));
    }
}