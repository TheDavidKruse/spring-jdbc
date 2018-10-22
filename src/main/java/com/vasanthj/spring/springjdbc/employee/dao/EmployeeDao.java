package com.vasanthj.spring.springjdbc.employee.dao;

import java.util.List;

import com.vasanthj.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	public int create(Employee employee);
	
	public Employee read(int id);
	
	public List<Employee> findAll(); 

}
