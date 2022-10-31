package com.kwei.springboot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot06DataJpaApplicationTests {

	@Autowired
	private DataSource dataSource;
	
	@Test
	void contextLoads() throws SQLException {
		
		System.out.println(dataSource.getClass());
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
		
	}

}
