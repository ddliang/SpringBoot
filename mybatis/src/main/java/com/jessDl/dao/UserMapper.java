package com.jessDl.dao;

import com.jessDl.model.User;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */

public interface UserMapper {

     User selectUser(Integer id);

     List<User> findByPage();
}
