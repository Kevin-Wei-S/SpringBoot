package com.kwei.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kwei.starter.GreetService;

@Controller
public class MyAutoConfiguratoinController {

	@Autowired
	private GreetService greetService;
	
	@GetMapping("/greet")
	public String greet(Model model) {
		
		String greet = greetService.sayHelloWorld("Kevin");
		model.addAttribute("greet", greet);
		
		return "greet";
	}
	
}
