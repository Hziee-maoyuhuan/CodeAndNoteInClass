package com.hziee.javaee0315.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller //用于到template中找到同名的文件
//@RestController // 用于返回json格式的数据或者字符串
public class UserController {       // 控制器是所有请求访问的第一道关

    @RequestMapping("showLogin")        // 请求映射(请求名) URL进行请求如果匹配则进入注解下的函数(方法)
    public String showLogin() {
        System.out.println("testPoint1");
        return "login";     // 指定了跳转的页面
    }

    @RequestMapping("showRegister")
    public String showRegister() {
        System.out.println("testPoint2");
        return "register";
    }

}
