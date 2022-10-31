package com.kwei.springboot;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot06DataJdbcApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void testJDBC() throws SQLException {
		// 默認數據源: com.zaxxer.hikari.HikariDataSource
		System.out.println(dataSource.getClass());
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.setAutoCommit(false);
		System.out.println("連接: 關閉自動提交");
		try {
			//int result = 101 / 0;
			conn.commit();
			System.out.println("連接: 提交");
		} catch(Exception e) {
			conn.rollback();
			System.out.println("連接: 回滾, 異常訊息: " + e.getMessage());
		} finally {
			conn.close();
			System.out.println("關閉連接");
		}
	}
	
	@Test
	void contextLoads() {
		
	}
	

}
