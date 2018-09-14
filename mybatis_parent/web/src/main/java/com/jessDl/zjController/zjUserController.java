package com.jessDl.zjController;

import com.jessDl.zjpojo.User;
import com.jessDl.zjservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by EDZ on 2018/8/30.
 */
@RestController
@RequestMapping(value = "/zj")
public class zjUserController {


    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public User find(Integer id){
        return userService.selectUsers(1);
    }

}
