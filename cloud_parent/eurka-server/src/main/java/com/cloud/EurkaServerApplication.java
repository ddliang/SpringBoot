package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//注册中心
@SpringBootApplication
@EnableEurekaServer
public class EurkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurkaServerApplication.class, args);
	}
}
