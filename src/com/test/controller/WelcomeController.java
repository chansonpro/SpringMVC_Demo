package com.test.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by: zhangsong09@baidu.com
 * Date-Time: 2017/8/9 19:05
 */
public class WelcomeController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //System.out.println("welcome");
        return new ModelAndView("welcome");
    }
}

