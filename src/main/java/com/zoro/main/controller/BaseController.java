package com.zoro.main.controller;


import com.zoro.main.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/user")
    public UserInfo getUser() {
        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("赵光夫");
//        userInfo.setPassword("123");
        return userInfo;
    }
}






