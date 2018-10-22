package com.vasanthj.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.vasanthj.spring.springjdbc.employee.dao.EmployeeDao;
import com.vasanthj.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.vasanthj.spring.springjdbc.employee.dto.Employee;

@Component 
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		return jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastName()); 
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		Employee emp = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		return emp; 
	}

	@Override
	public List<Employee> findAll() {
		String sql = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return employees; 
	}

}
