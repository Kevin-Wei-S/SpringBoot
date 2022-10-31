package com.kwei.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@RequestMapping("/greet")
	public String greet() {
		
		return "Amitofo";
	}
	
}
