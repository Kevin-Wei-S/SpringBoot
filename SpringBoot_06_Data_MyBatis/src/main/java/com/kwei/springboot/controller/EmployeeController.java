package com.kwei.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kwei.springboot.bean.Employee;
import com.kwei.springboot.mapper.EmployeeMapper;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeMapper empMapper;
	
	@GetMapping("/emp/get/{id}")
	public Employee getEmpById(@PathVariable("id") Integer id) {
		Employee emp = empMapper.getEmpById(id);
		return emp;
	}
	
	@GetMapping("/emp/get")
	public List<Employee> getAllEmps(){
		List<Employee> emps = empMapper.getAllEmps();
		return emps;
	}
	
	@GetMapping("/emp/insert/{lastName}/{email}/{gender}/{dId}")
	public Employee insertEmp(@PathVariable("lastName") String lastName, 
			@PathVariable("email") String email, @PathVariable("gender") Integer gender,
			@PathVariable("dId") Integer dId) {
		
		Employee emp = new Employee(null, lastName, email, gender, dId);
		empMapper.insertEmp(emp);
		return emp;
	}
	
	@GetMapping("/emp/delete/{id}")
	public Employee deleteEmp(@PathVariable("id") Integer id) {
		Employee emp = empMapper.getEmpById(id);
		empMapper.deleteEmpById(id);
		return emp;
	}
	
	@GetMapping("/emp/update/{id}/{lastName}/{email}/{gender}/{dId}")
	public Employee updateEmp(@PathVariable("id") Integer id,@PathVariable("lastName") String lastName, 
			@PathVariable("email") String email, @PathVariable("gender") Integer gender,
			@PathVariable("dId") Integer dId) {
		
		Employee emp = new Employee(id, lastName, email, gender, dId);
		empMapper.updateEmp(emp);
		return emp;
	}
	
}
