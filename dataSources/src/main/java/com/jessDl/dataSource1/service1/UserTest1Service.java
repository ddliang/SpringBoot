package com.jessDl.dataSource1.service1;

import com.github.pagehelper.PageInfo;
import com.jessDl.model.User;

/**
 * Created by EDZ on 2018/8/27.
 */
public interface UserTest1Service {
     User selectUser(Integer id);
     PageInfo<User> findByPage(Integer pageNum, Integer pageSize);

     Integer save(User user);
}
