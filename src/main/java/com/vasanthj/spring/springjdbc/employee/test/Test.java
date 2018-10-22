package com.vasanthj.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vasanthj.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.vasanthj.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/vasanthj/spring/springjdbc/employee/test/config.xml");
		EmployeeDaoImpl employeeDaoImpl = (EmployeeDaoImpl) context.getBean("employeeDaoImpl");
		Employee employee = new Employee();
		employee.setId(35);
		employee.setFirstname("John");
		employee.setLastName("Doe");
		int result = employeeDaoImpl.create(employee);
		System.out.print("No of rows created: "+result);
	}

}
