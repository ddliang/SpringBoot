package com.jessDl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jessDl.dao.UserMapper;
import com.jessDl.model.User;
import com.jessDl.service.UserService;
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
    public PageInfo<User> findByPage(Integer pageNum,Integer pageSize) {
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
