package com.jessDl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: by DaiLiang
 * Describe:
 * Created on 2018/8/29.
 */
@RestController
@RequestMapping("/,,,,error")
public class ErrorController {

    @RequestMapping("/getUser")
    public String getUser(){
        int i=1/0;
        return "success";
    }
}
