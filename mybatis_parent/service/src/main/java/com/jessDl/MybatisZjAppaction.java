package com.jessDl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by EDZ on 2018/8/30.
 */
@SpringBootApplication
@MapperScan("com.jessDl.zjdao")
public class MybatisZjAppaction {
    public static void main(String[] args) {
        SpringApplication.run(MybatisZjAppaction.class, args);
    }
}
