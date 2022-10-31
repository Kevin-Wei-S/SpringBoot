package com.kwei.springboot.initializer;

import java.time.Duration;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

// 此實現接口需添加至META-INF/spring.factories方可生效
public class GreetSpringApplicationRunListener implements SpringApplicationRunListener {
	
	// 參照SpringApplicationRunListener其餘實現類來創建構造器
	public GreetSpringApplicationRunListener(SpringApplication application, String[] args) {
		
	}
	
	@Override
	public void starting(ConfigurableBootstrapContext bootstrapContext) {
		System.out.println("GreetSpringApplicationRunListener: Starting...");
		SpringApplicationRunListener.super.starting(bootstrapContext);
	}

	@Override
	public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext,
			ConfigurableEnvironment environment) {
		Object osName = environment.getSystemProperties().get("os.name");
		System.out.println("GreetSpringApplicationRunListener: EnvironmentPrepared..." + osName);
		SpringApplicationRunListener.super.environmentPrepared(bootstrapContext, environment);
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("GreetSpringApplicationRunListener: ContextPrepared...");
		SpringApplicationRunListener.super.contextPrepared(context);
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("GreetSpringApplicationRunListener: ContextLoaded...");
		SpringApplicationRunListener.super.contextLoaded(context);
	}

	@Override
	public void started(ConfigurableApplicationContext context, Duration timeTaken) {
		System.out.println("GreetSpringApplicationRunListener: Started...");
		SpringApplicationRunListener.super.started(context, timeTaken);
	}

	@Override
	public void started(ConfigurableApplicationContext context) {
		System.out.println("GreetSpringApplicationRunListener: Started...");
		SpringApplicationRunListener.super.started(context);
	}

	@Override
	public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
		System.out.println("GreetSpringApplicationRunListener: Ready...");
		SpringApplicationRunListener.super.ready(context, timeTaken);
	}

	@Override
	public void running(ConfigurableApplicationContext context) {
		System.out.println("GreetSpringApplicationRunListener: Running...");
		SpringApplicationRunListener.super.running(context);
	}

	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("GreetSpringApplicationRunListener: Failed...");
		SpringApplicationRunListener.super.failed(context, exception);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("GreetSpringApplicationRunListener: Finalize...");
		super.finalize();
	}

		
}
