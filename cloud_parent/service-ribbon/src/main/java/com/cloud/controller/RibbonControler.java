package com.cloud.controller;

import com.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by EDZ on 2018/9/11.
 */
@RestController
public class RibbonControler {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

    @GetMapping(value = "/hiHystrix")
    public String hiHystrix(@RequestParam String name) {
        return helloService.hiHystrix( name );
    }
}
