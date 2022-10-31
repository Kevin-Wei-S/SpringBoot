package com.kwei.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String greet() {
		
		return "退步原來是向前";
		
	}
	
}
