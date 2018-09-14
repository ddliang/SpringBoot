package com.jessDl.zjservice.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jessDl.zjdao.UserMapper;
import com.jessDl.zjpojo.User;
import com.jessDl.zjservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public PageInfo<User> findByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userDao.findByPage();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public User selectUsers(Integer id) {
        System.out.println();
        return userDao.selectUser(id);
    }
}
