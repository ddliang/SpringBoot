package com.jessDl.dataSource1.service1.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jessDl.dataSource1.mapper.UserMapper;
import com.jessDl.dataSource1.service1.UserTest1Service;
import com.jessDl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@Service("userService1")
public class UserServicetTest1Impl implements UserTest1Service {
    @Autowired
    private UserMapper userDao;

    @Override
    public PageInfo<User> findByPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userDao.findByPage();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public Integer save(User user) {
        return this.userDao.save(user);
    }

    @Override
    public User selectUser(Integer id) {
        System.out.println();
        return userDao.selectUser(id);
    }


}
