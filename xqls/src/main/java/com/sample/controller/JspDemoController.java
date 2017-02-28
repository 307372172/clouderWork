package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Skeyedu on 2017/1/22.
 */
@Controller
@RequestMapping(value = "/demo")
public class JspDemoController {
    @RequestMapping(value = "/hello")
    public String list() {
        return "hello";
    }
}
