package com.kwei.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/greet")
	public String getSQLList(Model model) {
		
		List<Map<String,Object>> list = jdbcTemplate.queryForList("SELECT * FROM department;");
		model.addAttribute("list", list);
		return "greet";
		
	}
	
}
