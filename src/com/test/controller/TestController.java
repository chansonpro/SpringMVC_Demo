package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by: zhangsong09@baidu.com
 * Date-Time: 2017/8/9 21:51
 */
@Controller
public class TestController {

    //RequestMapping表示使用哪个URL来对应
    @RequestMapping({"/test", "/"})
    public String test(String username, Model model) {
        System.out.println("I Love China！");
        //往前台视图传参数
        model.addAttribute("username",username);
        //context.put("username", username);
        System.out.println(username);
        return "test";//test对应WEB-INF/jsp
    }
/*    @RequestMapping({"/welcome"})
    public String welcome(){
        System.out.println("战狼2很燃");
        return "welcome";
    }*/
}
