package com.jessDl.controller;

import com.github.pagehelper.PageInfo;
import com.jessDl.dataSource1.service1.UserTest1Service;
import com.jessDl.dataSource2.service2.UserTest2Service;
import com.jessDl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: by DaiLiang
 * Describe:多数据源测试
 * Created on 2018/9/1.
 */
@RestController
@RequestMapping("/datasource")
public class DataSourcesController {
    @Autowired
    @Qualifier("userService1")
    private UserTest1Service userService1;

    @Autowired
    @Qualifier("userService2")
    private UserTest2Service userService2;

    @RequestMapping("/user1")
    public User getUser(){
        return this.userService1.selectUser(1);
    }

    @RequestMapping("/user2")
    public User getUser2(){
        return this.userService2.selectUser(1);
    }

    @RequestMapping("/save2")
    public Integer save2(){
        User user = new User();
        user.setAge(22);
        user.setName("多数据源");
        user.setPassword("3333333");
        return this.userService2.save(user);
    }

    @RequestMapping("findPage")
    public PageInfo<User> findByPage(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                             int pageNum,
                                     @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                                             int pageSize){
        return userService2.findByPage(pageNum,pageSize);
    }
}
