package com.test.controller;

import com.test.model.User;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by: zhangsong09@baidu.com
 * Date-Time: 2017/8/11 8:45
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    //private static final Log logger = LogFactory.getLog(UserController.class);
    //定义map集合，引用变量users的编译类型为Map，运行类型为HashMap
/*
    public UserController() {
        users.put("rl",new User("rl","123","任蕾","rl@163.com"));
        users.put("cxh",new User("cxh","123","陈晓红","cxh@163.com"));
        users.put("wxq",new User("wxq","123","王秀琴","wxq@163.com"));
        users.put("wx",new User("wx","123","王鑫","wx@163.com"));
        users.put("zqh",new User("zqh","123","张启航","zqh@163.com"));

    }
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("users",users);
        return "/user/list";
    }*/

    @ModelAttribute
    public void userModel(String username, String password, ModelAndView mv) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //将user对象添加到modelandview的model中
        mv.addObject("user",user);
    }
    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView mv){
        //从modelandview中取出model对象
        User user = (User) mv.getModel().get("user");
        System.out.println(user);
        user.setUsername("测试");
        user.setPassword("121212");
        mv.setViewName("result");
        return mv;
    }

}

