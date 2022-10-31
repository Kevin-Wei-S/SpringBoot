package com.kwei.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication: 來標註一個主程序類, 說明這是一個SpringBoot應用
 * @author a8566
 *
 */
@SpringBootApplication
public class SpringBoot01HelloWorldApplication {
	
	public static void main(String[] args) {
		// 將Spring應用啟動
		SpringApplication.run(SpringBoot01HelloWorldApplication.class, args);
	}
	
}
