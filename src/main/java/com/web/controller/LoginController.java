/*
 * @(#) LoginController
 * <br> Copyright:  Copyright (c) 2017
 * <br> @author caijinhuang
 * <br> 2017-10-29 15:49:11
 */

package com.web.controller;


import com.service.api.UserService;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
public class LoginController{

    @Resource
    private UserService userService;

    Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping("/index.do")
    public String index(){
        logger.info("登陆页测试");
        return "index";
    }
}

