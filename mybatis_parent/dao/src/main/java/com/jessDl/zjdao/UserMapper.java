package com.jessDl.zjdao;


import com.jessDl.zjpojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@Mapper
public interface UserMapper {
     @Select("SELECT * FROM USER WHERE id = #{id}")
     User selectUser(@Param("id")Integer id);

     List<User> findByPage();
}
