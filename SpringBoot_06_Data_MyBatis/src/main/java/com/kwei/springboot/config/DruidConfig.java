package com.kwei.springboot.config;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {

	@ConfigurationProperties(prefix="spring.datasource")
	@Bean
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}

	// 配置Druid監控
	// 1. 配置一個管理後台的Servlet
	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		Map<String, String> initParams = new HashMap<>();
		initParams.put("loginUsername", "admin");
		initParams.put("loginPassword", "root");
		// 空白或不寫, 即默認允許所有皆可訪問.
		initParams.put("allow", "");
		initParams.put("deny", "192.168.1.108");
		bean.setInitParameters(initParams);
		return bean;
	}

	// 2. 配置一個監控的Filter
	@Bean
	public FilterRegistrationBean webStatFilter() {

		FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
		Collection<String> urlPatterns = List.of("/*");
		bean.setUrlPatterns(urlPatterns);

		Map<String, String> initParams = new HashMap<>();
		initParams.put("exclusions", "*.js,*.css,/druid/*");

		bean.setInitParameters(initParams);

		return bean;
	}

}
