package com.kwei.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 這個類的所有方法返回的數據直接寫給瀏覽器(如果是對象轉為Json數據)
/*@ResponseBody
@Controller*/
// 合併上兩
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		
		return "Amitofo";
		
	}
	
}
