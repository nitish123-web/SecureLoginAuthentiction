package com.example.demo.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

import com.example.demo.repo.RegisterRepo;

import com.example.demo.model.Employee;

@Service
public class RegisterService {
	
	private final RegisterRepo RegisterRepo;
	
	public RegisterService(RegisterRepo  RegisterRepo) {
		this.RegisterRepo=RegisterRepo;
	}
	
	
	public String registeruser(Employee emp) throws NoSuchAlgorithmException {
		
		int rows=RegisterRepo.RegisterEmployee(emp);
		
		
		return rows>0?"user registered successfull":"Error While registering";
		
		
		
	}

}
