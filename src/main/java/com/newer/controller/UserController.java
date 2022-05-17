package com.newer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class UserController {

    @RequestMapping("/user/query")
    @PreAuthorize("hasAuthority('user:query')")
    public String selectList() {
        log.info("查询所有用户");
        return "user/query";
    }

    @RequestMapping("/user/add")
    public String save() {
        log.info("添加用户");
        return "user/add";
    }

    @RequestMapping("/user/test")
    @PreAuthorize("hasRole('USER')")
    public String test() {
        log.info("测试用户");
        return "user/test";
    }

    @RequestMapping("/user/update")
    @PreAuthorize("hasRole('USER')")
    public String update() {
        log.info("修改用户");
        return "user/update";
    }
}

