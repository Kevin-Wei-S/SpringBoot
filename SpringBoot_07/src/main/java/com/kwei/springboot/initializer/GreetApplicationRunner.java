package com.kwei.springboot.initializer;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// 此實現接口注入IOC容器中即可生效
@Component
public class GreetApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("GreetApplicationRunner: Run..." + List.of(args));
	}

}
