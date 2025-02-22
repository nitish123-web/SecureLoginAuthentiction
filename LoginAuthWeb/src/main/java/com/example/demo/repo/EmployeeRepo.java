package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;	
	
	public Employee getEmployeeByCode(String Empid) {
		String sql="SELECT * FROM EMPLOYEE WHERE EMPID = ?";
		try {
			return jdbcTemplate.queryForObject(sql,  new BeanPropertyRowMapper<>(Employee.class), Empid);	
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
	
	
	
}
