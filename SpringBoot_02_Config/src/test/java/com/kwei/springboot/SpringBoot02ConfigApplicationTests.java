package com.kwei.springboot;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kwei.springboot.bean.Hero;
import com.kwei.springboot.bean.Person;
import com.kwei.springboot.service.HelloService;
import com.kwei.springboot.util.SupportUtils;

/**
 *  SpringBoot的單元測試
 * @author a8566
 *
 */
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

	@Autowired
	private Person person;
	@Autowired
	private Hero hero;
	@Autowired
	private HelloService helloService;
//	@Autowired
//	private ApplicationContext ioc;
	
	@Test
	public void testHelloService() {
		System.out.println(helloService);
		// 根據Bean之id判斷Bean是否存在
//		System.out.println(ioc.containsBean("helloService"));
	}
	
	@Test
	public void testHeroPojo() {
		System.out.println(hero);
	}
	
	@Test
	void testYml() throws UnsupportedEncodingException {
		person.setLastName(SupportUtils.toUTF8(person.getLastName()));
		System.out.println(person);
	}
	
	@Test
	void contextLoads() {
	}

}
