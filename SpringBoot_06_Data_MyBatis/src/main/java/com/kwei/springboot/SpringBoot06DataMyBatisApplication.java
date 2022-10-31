package com.kwei.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kwei.springboot.mapper")
@SpringBootApplication
public class SpringBoot06DataMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot06DataMyBatisApplication.class, args);
	}

}
