package com.kwei.springboot.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

// 此實現接口需添加至META-INFO/spring.factories方可生效
public class GreetApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("GreetApplicationContextInitializer: Initialize..." + applicationContext);
	}

}
