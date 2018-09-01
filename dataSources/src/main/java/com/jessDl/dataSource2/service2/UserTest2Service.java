package com.jessDl.dataSource2.service2;

import com.github.pagehelper.PageInfo;
import com.jessDl.model.User;

/**
 * Created by EDZ on 2018/8/27.
 */
public interface UserTest2Service {
     User selectUser(Integer id);
     PageInfo<User> findByPage(Integer pageNum, Integer pageSize);

     Integer save(User user);
}
