package com.kwei.springboot;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

	//紀錄器
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	void contextLoads() {
//		System.out.println();
		
		//日誌級別: 由低至高, 且可以調整日誌的輸出級別.
		//SpringBoot默認輸出級別為root(Info)級別
		logger.trace("Trace日誌...");
		logger.debug("Debug日誌...");
		logger.info("Info日誌...");
		logger.warn("Warn日誌...");
		logger.error("Error日誌...");
		
		
	}

}
