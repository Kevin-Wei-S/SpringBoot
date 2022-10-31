package com.kwei.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

// 註解版配置 無法再配置版生效(Ex: Employee)
@org.springframework.context.annotation.Configuration
//@Component
public class MyBatisConfig {

	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		
		ConfigurationCustomizer customizer = new ConfigurationCustomizer() {
			@Override
			public void customize(Configuration configuration) {
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
		
		return customizer;
	}
	
}
