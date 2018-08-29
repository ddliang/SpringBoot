package com.jessDl.service;

import com.github.pagehelper.PageInfo;
import com.jessDl.model.User;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
public interface UserService {
     User selectUsers(Integer id);
     PageInfo<User> findByPage(Integer pageNum,Integer pageSize);
}
