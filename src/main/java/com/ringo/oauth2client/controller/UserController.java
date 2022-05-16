package com.ringo.oauth2client.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser2(Authentication authentication){
        System.out.println("请求通过");
        return authentication;
    }
}
