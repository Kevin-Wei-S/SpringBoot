package com.kwei.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kwei.springboot.bean.Employee;

//@Mapper 或者 全局註解@MapperScan(目前已使用)
public interface EmployeeMapper {

	public Employee getEmpById(@Param("id") Integer id);
	
	public List<Employee> getAllEmps();
	
	public void insertEmp(Employee emp);

	public void deleteEmpById(@Param("id") Integer id);
	
	public void updateEmp(Employee emp);
	
}
