package com.cj.cloud.adminservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin")
public class AdminController {


    @GetMapping("test")
    public String tset(){
        return "测试adminService";
    }
}
