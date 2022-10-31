package com.kwei.springboot.initializer;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// 此實現接口注入IOC容器中即可生效
@Component
public class GreetCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("GreetCommandLineRunner: Run..." + List.of(args));
	}

}
