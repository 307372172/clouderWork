package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sample.bean.AdministrationBean;
import com.sample.biz.AdministrationBiz;
import com.sample.util.CommonPage;
import com.sample.util.CommonResult;

@Controller
@RequestMapping(value = "/administration")
public class AdministrationController {

	
	
	@Autowired
	private AdministrationBiz administrationBiz;

	@RequestMapping(value = "/administrationList")
	public ModelAndView administrationList() {
		ModelAndView view = new ModelAndView("administration/administrationList");
		/*List<Object> columns_name = new ArrayList<Object>();
		List<Object> columns = new ArrayList<Object>();
		List<String> displayfiled=administrationBiz.conversion("realdata");
		for (String display : displayfiled) {
			columns_name.add(display);
			System.out.println(display);
		}
		
		List<String> fieldalias=administrationBiz.fieldalias("realdata");
		for (String fieldalia : fieldalias) {
			columns.add(fieldalia);
			System.out.println(fieldalia);
		}
		*/
		return view;
	}

	@RequestMapping(value = "/administrationListData")
	@ResponseBody
	public CommonResult administrationListData(CommonPage commonPage) {
		CommonResult result = administrationBiz.queryAdministration(commonPage);
		if (result.getIsSuccess()) {
			result.setData(commonPage.toSHowPage());
			System.out.println(commonPage.toSHowPage());
		}
		return result;
	}


	@RequestMapping(value = "/maintainAdministration")
	public ModelAndView maintainAdministration(String tableno) {
		ModelAndView view = new ModelAndView("administration/maintainAdministration");
		AdministrationBean administrationBean = administrationBiz.queryAdministratiobByTableno(tableno);

		String[] display = administrationBean.getDisplayfield().split(",");// 显示字段
		String[] hidden = administrationBean.getHiddenfield().split(",");// 所有字段
		List<String> fields = new ArrayList<String>();
		List<String> hiddenfields = new ArrayList<String>();

		for (int i = 0; i < display.length; i++) {
			fields.add(display[i]);

		}

		for (int i = 0; i < hidden.length; i++) {
			hiddenfields.add(hidden[i]);
		}
		view.addObject("alldisplay", fields);
		view.addObject("allfields", hiddenfields);
		view.addObject("administration", administrationBiz.queryAdministratiobByTableno(tableno));
		return view;
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public CommonResult administrationSave(AdministrationBean bean) {
		// CommonResult result=enterpriseBiz.editEnterprise(bean,"001");
		CommonResult result = administrationBiz.updateAdministration(bean);
		System.out.println(bean.getDisplayfield());

		return result;

	}
	
	 @RequestMapping(value="administrationEdit")
     public ModelAndView realdataEdit(String tableno){
 		ModelAndView view=new ModelAndView("administration/administrationEdit");
 		view.addObject("administration", administrationBiz.queryAdministratiobByTableno(tableno));
 		return view;
 	}
	 
	 @RequestMapping(value="/saveFiled")
		@ResponseBody
	    public CommonResult Save(AdministrationBean bean,String filed,String fieldalias ,String type,int isdisplay) {
		 	/*String str = bean.getTablename();
	        StringBuffer sb = new StringBuffer();
			for(int i = 0;i<str.length();i++){
				char c = str.charAt(i);
				if((c<='z'&&c>='a')||(c<='Z'&&c>='A')){
					sb.append(c);
				}
			}
			System.out.println(sb.toString());//提取数据库表名
*/	        CommonResult  result = administrationBiz.addFiled(bean.getTablename(), filed, type);
	        String display=","+fieldalias+filed;
	        AdministrationBean beans=new AdministrationBean();
	        beans.setTableno(bean.getTableno());
	        beans.setTablename(bean.getTablename());
	        beans.setHiddenfield(bean.getHiddenfield()+display);
	        if(isdisplay==1){
	        	beans.setDisplayfield(bean.getDisplayfield()+display);
	        }else{
	        	 beans.setDisplayfield(bean.getDisplayfield());
	        }
	       
	        result=administrationBiz.updateAdministration(beans);
	        
	        
	       
	        return result;
	       
	    }

}
