package com.jessDl.controller;

import com.github.pagehelper.PageInfo;
import com.jessDl.model.User;
import com.jessDl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@RestController
@RequestMapping(value = "/hello")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/say")
    public String sayHello(){
        return "哈哈哈";
    }

    @RequestMapping(value = "/getUser")
    public User getUser(Integer id){
        return userService.selectUsers(id);
    }

    @RequestMapping("findPage")
    public PageInfo<User> findByPage(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                         int pageNum,
                                     @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                                         int pageSize){
        return userService.findByPage(pageNum,pageSize);
    }
}
