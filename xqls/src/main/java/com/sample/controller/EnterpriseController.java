package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.bean.EnterpriseBean;
import com.sample.biz.EnterpriseBiz;
import com.sample.service.BlockService;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

import java.util.List;

/**
 * Created by Skeyedu on 2017/1/19.
 */
@Controller
@RequestMapping(value = "/enterprise")
public class EnterpriseController {

  @Autowired private EnterpriseBiz enterpriseBiz;


    @Autowired  private BlockService blockService;
//
//    @RequestMapping(value = "/enterpriseList")
//    public ModelAndView list() {
//        ModelAndView view = new ModelAndView("enterprise/enterpriseList");
//        return view;
//    }
    @RequestMapping(value = "/enterpriseList")
   /* public String list() {
        return "enterprise/enterpriseList";
    }*/
    public ModelAndView list() {
        ModelAndView view = new ModelAndView("enterprise/enterpriseList");
        view.addObject("allBlock",blockService.getAllBlock());
       return view;
    }

    @RequestMapping("/enterpriseListData")
    @ResponseBody
    public CommonResult enterpriseListData(CommonPage commonPage) {
        CommonResult result= enterpriseBiz.getEnterpriseByPage(commonPage);
        if(result.getIsSuccess()){
            result.setData(commonPage.toSHowPage());
        }
        return result;
    }

    @RequestMapping(value = "/enterpriseEdit")
    public ModelAndView enterpriseEdit(Integer  enterpriseNo) {
        ModelAndView view = new ModelAndView("enterprise/enterpriseEdit");
        view.addObject("allBlock",blockService.getAllBlock());
        view.addObject("enterprise",enterpriseBiz.getEnterpriseById(enterpriseNo,"001"));

        return view;
    }

    @RequestMapping(value = "/enterpriseSave")
    @ResponseBody
    public CommonResult enterpriseSave(EnterpriseBean bean) {
        CommonResult  result=enterpriseBiz.editEnterprise(bean,"001");

        return result;
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public CommonResult enterpriseDel(@RequestBody  List<String> ids) {
        CommonResult  result=enterpriseBiz.deleteEnterprise(ids,"001");
        return result;
    }
}
