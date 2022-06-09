package com.newer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping({"/", "/home", "/index"})
    public String index() {
        log.info("qwww");
        return "index";
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        log.info("进入登录页");
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        System.out.println("接收到用户名： " + username + ",密码：" + password);
        return "index";
    }

    @RequestMapping("/login-error")
    public String loginError() {
        return "error";
    }
}