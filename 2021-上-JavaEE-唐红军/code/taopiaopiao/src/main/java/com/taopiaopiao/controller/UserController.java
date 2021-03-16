package com.taopiaopiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("showLogin")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("showRegister")
    public String showRegister(){
        return "register";
    }

}
