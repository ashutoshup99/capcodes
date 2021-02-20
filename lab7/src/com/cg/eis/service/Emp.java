package com.cg.eis.service;

interface EmployeeService {
	public void scheme(String insuranceScheme);
}
public class Emp implements EmployeeService{
	@Override
	public void scheme(String insuranceScheme) {
		if(insuranceScheme.equalsIgnoreCase("Schema C")) {
			System.out.println("Your salary is between 5000 and 20000 and Designation is System Associate");
		}
		else if(insuranceScheme.equalsIgnoreCase("Schema B")) {
			System.out.println("Your salary is between 20000 and 40000 and Designation is Programmer");
		}
		else if(insuranceScheme.equalsIgnoreCase("Schema A")) {
			System.out.println("Your salary is greater than 40000 and Designation is Manager");
		}
		else {
			System.out.println("Your salary is less than 5000 and Designation is Clerk");
		}
	}
	
}

