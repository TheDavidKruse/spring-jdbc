package com.vasanthj.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vasanthj/spring/springjdbc/config.xml");
		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = template.update(sql, 20, "Vasanth", "Jayabalan");
		System.out.println("No of records inserted are: " + result); 
	}

}
