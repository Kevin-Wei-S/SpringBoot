package com.kwei.springboot;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kwei.springboot.bean.Department;
import com.kwei.springboot.controller.DepartmentController;

@SpringBootTest
class SpringBoot06DataMyBatisApplicationTests {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private DepartmentController departmentController;
	
	
	@Test
	void testDeptMapper() {
		
//		Department dept = departmentController.getDeptById(9004);
//		System.out.println(dept);
		
//		int result = departmentController.insertDept(new Department(null, "SS"));
//		System.out.println(result);
		
//		int result = departmentController.updateDeptById(new Department(9008,"PS"));
//		System.out.println(result);
		
//		int result = departmentController.deleteDeptById(9008);
//		System.out.println(result);
		
//		System.out.println();
//		List<Department> depts = departmentController.getAllDepts();
//		depts.forEach(System.out::println);
		
	}
	
	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		conn.close();
	}

}
