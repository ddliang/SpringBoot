package com.jessDl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by EDZ on 2018/8/27.
 */
@SpringBootApplication
@MapperScan("com.jessDl.dao")
public class MybatisSpringAppaction {
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringAppaction.class, args);
    }
}
