package com.jessDl.error;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Author: by DaiLiang
 * Describe:全局捕获异常-
 * Created on 2018/8/29.
 */
//该注解表示切点
@ControllerAdvice(basePackages = "com.jessDl.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        Map<String,Object> map = Maps.newHashMap();
        map.put("errorCode",500);
        map.put("errorMsg","全局捕获异常");
        return map;
    }
}
