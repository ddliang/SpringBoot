package com.jessDl.dataSource2.mapper;

import com.jessDl.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by EDZ on 2018/8/27.
 */
@Mapper
public interface UserMapper2 {

     @Select("SELECT * FROM USER WHERE id = #{id}")
     User selectUser(@Param("id") Integer id);

     @Select("SELECT * FROM USER ")
     List<User> findByPage();

     @Insert("insert into user ( name, age, password) values(#{name},#{age},#{password})")
     Integer save(User user);
}
