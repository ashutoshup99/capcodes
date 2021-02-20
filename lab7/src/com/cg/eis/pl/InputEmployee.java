package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Emp;

public class InputEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(11,"Phoebe",36781,"Programmer","Schema B");
		Employee e2=new Employee(12,"Racehl",10000,"System Asscoiate","Schema C");
		Employee e3=new Employee(13,"Monicka",20000,"Programmer","Schema B");
		Employee e4=new Employee(14,"Joey",44221,"Manager","Schema A");
		Employee e5=new Employee(15,"Chandler",54421,"Manager","Schema A");
		Employee e6=new Employee(16,"Ross",36589,"Programmer","Schema B");
		HashMap<Employee, String> mapEmployee = new HashMap<>();
		mapEmployee.put(e1, e1.getInsuranceScheme());
		mapEmployee.put(e2, e2.getInsuranceScheme());
		mapEmployee.put(e3, e3.getInsuranceScheme());
		mapEmployee.put(e4, e4.getInsuranceScheme());
		mapEmployee.put(e5, e5.getInsuranceScheme());
		mapEmployee.put(e6, e6.getInsuranceScheme());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the insurance schema");
		String input=sc.nextLine();
		Emp obj=new Emp();
		obj.scheme(input);
		System.out.println("Deleting employee Details e1 ");
		mapEmployee.remove(e1);
		System.out.println("Deleted");
		for(Map.Entry<Employee,String> i: mapEmployee.entrySet()){
			System.out.println("Employee Obejct = " + i.getKey() +  
	                ", Insurance Sceheme = " + i.getValue());
		}
	}

}
