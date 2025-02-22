package com.example.demo.repo;

import org.springframework.jdbc.core.JdbcTemplate;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.SHA256Util;
import com.example.demo.model.Employee;

@Repository
public class RegisterRepo {
	
	@Autowired
	JdbcTemplate JdbcTemplate;
//	@Autowired
//	BCryptPasswordEncoder BCryptPasswordEncoder;
	
//	public RegisterRepo(JdbcTemplate JdbcTemplate,BCryptPasswordEncoder BCryptPasswordEncoder) {
//		this.JdbcTemplate=JdbcTemplate;
//		this.BCryptPasswordEncoder=BCryptPasswordEncoder;
//	}

	public int RegisterEmployee(Employee emp) throws NoSuchAlgorithmException {
		
		String sql = "INSERT INTO Employee (Empid , Empname , Empmail , password) VALUES (?, ?, ?, ?)";
		//String hashedpassword=BCryptPasswordEncoder.encode(emp.getPassword());
		String HashedPassword=SHA256Util.hashPassword(emp.getPassword());
		return JdbcTemplate.update(sql,emp.getEmpid(),emp.getEmpname(),emp.getEmpmail(),HashedPassword);
		
	}
	
	
}
