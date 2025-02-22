package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.RegisterService;
import com.example.demo.model.Employee;

import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class logincontroller {

	@GetMapping({"/","login"})
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return "register";
	
	}
	
	
	private final RegisterService RegisterService;
	
	public logincontroller(RegisterService RegisterService) {
		this.RegisterService=RegisterService;
	}
	
	@PostMapping("/success")
	public String success(@RequestParam int Empid,@RequestParam String Empname,@RequestParam String Empmail,@RequestParam String password,Model model) throws NoSuchAlgorithmException{

		Employee emp=new Employee(Empid,Empname,Empmail,password);
		String response=RegisterService.registeruser(emp);
		model.addAttribute("message",response);
		return "success";
		
		
	}
	
	
	
}
