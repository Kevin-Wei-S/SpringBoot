package com.kwei.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {

	@RequestMapping("/success")
	public String toSuccess(Model model) {
		model.addAttribute("msg", "Amitofo");
		return "success";
	}
	
	
}
