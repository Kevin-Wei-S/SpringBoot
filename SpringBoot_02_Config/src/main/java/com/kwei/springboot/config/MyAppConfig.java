package com.kwei.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kwei.springboot.service.HelloService;

// 通知SpringBoot此為配置類; 用來替換Spring配置文件;
@Configuration
public class MyAppConfig {
	
	//將標示@Bean方法的返回值作為Bean, 並交由IOC容器管理, 且此Bean之id為標示@Bean方法的方法名.
	@Bean 
	public HelloService helloService() {
		HelloService helloService = new HelloService();
		return helloService;
	}
	
}
