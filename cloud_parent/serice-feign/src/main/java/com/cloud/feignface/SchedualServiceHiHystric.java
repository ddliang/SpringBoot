package com.cloud.feignface;

import org.springframework.stereotype.Component;

/**断路器方法
 * Created by EDZ on 2018/9/12.
 */
//SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
