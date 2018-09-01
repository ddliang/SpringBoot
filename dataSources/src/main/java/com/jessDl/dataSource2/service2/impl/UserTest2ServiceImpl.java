package com.jessDl.dataSource2.service2.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jessDl.dataSource2.mapper.UserMapper2;
import com.jessDl.dataSource2.service2.UserTest2Service;
import com.jessDl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@Service("userService2")
public class UserTest2ServiceImpl implements UserTest2Service {
    @Autowired
    private UserMapper2 userDao;

    @Override
    public PageInfo<User> findByPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userDao.findByPage();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public User selectUser(Integer id) {
        System.out.println();
        return userDao.selectUser(id);
    }

    @Override
    public Integer save(User user) {
        return this.userDao.save(user);
    }
}
