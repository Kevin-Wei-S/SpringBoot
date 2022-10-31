package com.kwei.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kwei.springboot.bean.Department;
import com.kwei.springboot.mapper.DepartmentMapper;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@GetMapping("/dept/get/{id}")
	public Department getDeptById(@PathVariable("id")Integer id) {
		return departmentMapper.getDeptById(id);
	}

	@GetMapping("/dept/get")
	public List<Department> getAllDepts(){
		List<Department> depts = departmentMapper.getAllDepts();
		return depts;
	}
	
	@GetMapping("/dept/insert/{deptName}")
	public Department insertDept(@PathVariable("deptName") String deptName) {
		Department dept = new Department(null, deptName);
		departmentMapper.insertDept(dept);
		return dept;
	}
	
	@GetMapping("/dept/delete/{id}")
	public Department deleteDeptById(@PathVariable("id") Integer id) {
		Department dept = departmentMapper.getDeptById(id);
		departmentMapper.deleteDeptById(id);
		return dept;
	}
	
	@GetMapping("/dept/update/{id}/{deptName}")
	public Department updateDeptById(@PathVariable("id") Integer id, @PathVariable("deptName") String deptName) {
		Department dept = new Department(id, deptName);
		departmentMapper.updateDeptById(dept);
		return dept;
	}
	
}
