package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Skeyedu on 2016/12/13.
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        return view;// "login";
    }



}
