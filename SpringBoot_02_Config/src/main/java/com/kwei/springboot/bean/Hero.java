package com.kwei.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:hero.properties")
//非默認全局配置文件application開頭的, 無法根據此標籤獲取值.
//如有設置PropertySource則配置文件改為 @PropertySource的value屬性
@ConfigurationProperties(prefix="hero")
public class Hero {

	private String name;
	private String role;
	private String gender;
	
	public Hero() {
		super();
	}

	public Hero(String name, String role, String gender) {
		super();
		this.name = name;
		this.role = role;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", role=" + role + ", gender=" + gender + "]";
	}
	
	
}
