package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//通过注解@EnableEurekaClient 表明自己是一个eurekaclient.即服务提供者 此处为提供者1
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "SpringCloud") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}
}
