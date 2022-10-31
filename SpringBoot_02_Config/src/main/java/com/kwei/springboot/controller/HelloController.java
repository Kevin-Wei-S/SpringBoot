package com.kwei.springboot.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kwei.springboot.util.SupportUtils;

@RestController
public class HelloController {

	@Value("${person.lastName}")
	private String name;
	
	@RequestMapping(value="/greet")
	public String greet() throws UnsupportedEncodingException {
		// 將Java編碼IOS-8859-1轉成UTF-8
		name = SupportUtils.toUTF8(name);
		
		return new String(name);
	}
	
}
