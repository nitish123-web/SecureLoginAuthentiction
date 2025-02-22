package com.example.demo.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SHA256Util;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo EmployeeRepo;
	
	public boolean authenticteuser(String Empid, String pass) throws NoSuchAlgorithmException {
		
		Employee emp=EmployeeRepo.getEmployeeByCode(Empid);
		
		String hashedpassword=SHA256Util.hashPassword(pass);
		
		return emp != null && emp.getPassword().equalsIgnoreCase(hashedpassword);
		
	}
	
	
	
	
}
