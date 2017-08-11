package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by: zhangsong09@baidu.com
 * Date-Time: 2017/8/10 9:34
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        //创建准备返回的ModelAndView对象，该对象通常包含了视图名、模型名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象
        mv.addObject("msg","你好战狼2！");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello");
        ///返回ModelAndView
        return mv;
    }
}

