package com.kwei.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingTransferAbstractLogApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	void contextLoads() {
		logger.trace("Logger-Trace...");
		logger.debug("Logger-Debug...");
		logger.info("Logger-Info...");
		logger.warn("Logger-Warn...");
		logger.error("Logger-Error...");
	}

}
