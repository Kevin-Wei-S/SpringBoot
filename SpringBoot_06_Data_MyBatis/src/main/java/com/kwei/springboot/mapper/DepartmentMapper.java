package com.kwei.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.kwei.springboot.bean.Department;

// 標示此為操作數據庫的Mapper 可在主程式上標示MapperScan
//@Mapper
public interface DepartmentMapper {

	@Select("SELECT * FROM mybatis.department WHERE id = #{id}")
	public Department getDeptById(Integer id);
	
	@Select("SELECT * FROM mybatis.department")
	public List<Department> getAllDepts();
	
	@Delete("DELETE FROM mybatis.department WHERE id = #{id}")
	public int deleteDeptById(Integer id);
	
	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("INSERT INTO mybatis.department(department_name) VALUES(#{departmentName})")
	public int insertDept(Department dept);
	
	@Update("UPDATE mybatis.department SET department_name = #{departmentName} WHERE id = #{id}")
	public int updateDeptById(Department dept);
	
}
