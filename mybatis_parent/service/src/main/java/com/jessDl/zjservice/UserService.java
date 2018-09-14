package com.jessDl.zjservice;


import com.github.pagehelper.PageInfo;
import com.jessDl.zjpojo.User;

/**
 * Created by EDZ on 2018/8/27.
 */
public interface UserService {
     User selectUsers(Integer id);
     PageInfo<User> findByPage(Integer pageNum, Integer pageSize);
}
