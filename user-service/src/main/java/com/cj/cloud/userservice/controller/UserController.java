package com.cj.cloud.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 在UserController类建一个“/user/hi”的API接口，对外提供服务
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi(){
        return "I'm forezp,来自user-service";
    }
}