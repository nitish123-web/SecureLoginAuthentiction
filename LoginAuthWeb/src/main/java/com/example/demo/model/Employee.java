package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int Empid;
	private String Empname;
	private String Empmail;
	private String password;
	
	
	public Employee() {
		super();
	}


	public Employee(int empid, String empname, String empmail, String password) {
		super();
		Empid = empid;
		Empname = empname;
		Empmail = empmail;
		this.password = password;
	}
	
	
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpmail() {
		return Empmail;
	}
	public void setEmpmail(String empmail) {
		Empmail = empmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empmail=" + Empmail + ", password=" + password
				+ "]";
	}
	

}
