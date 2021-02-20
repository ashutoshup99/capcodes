package day5;

import java.util.Arrays;

public abstract class Employee {
	int id;
	int totalLeavesForMonth=2;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract int calculateSalary();
	public void deductLeave() {
//		totalLeavesForMonth-=1;
		if(totalLeavesForMonth==0) {
			System.out.println("No more leaves available");
		}
		else {
			totalLeavesForMonth-=1;
			System.out.println("leaves available is "+ totalLeavesForMonth);
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		  Employee[] employees = new Employee[5];
	      employees[0] = new ContractEmployee(11, "Ram");
	      employees[1] = new ContractEmployee(12,"Sam");
	      employees[2] = new ContractEmployee(13, "John");
	      employees[3] = new RegularEmployee(14, "Anil",30);
	      employees[4] = new RegularEmployee(15,"Paul",30);
	      int totalSal=0;
	      int avgSal=0;
	      double []sal=new double[5];
	      for (int i = 0; i < employees.length; i++) {
	          System.out.println(employees[i].toString());
	          totalSal+= employees[i].calculateSalary();
	          sal[i]=employees[i].calculateSalary();
	          employees[i].deductLeave();
	          employees[i].deductLeave();
	          employees[i].deductLeave();
	       }
//	      avgSal=(totalSal/employees.length);
//	      Arrays.sort(sal);
//	      System.out.println("Highest Salary is " + sal[sal.length-1] +" "+ "Average salary is " + avgSal);
	      averageSalary(sal);
          highestSalary(sal);
	}
	private static void highestSalary(double[] sal) {
		// TODO Auto-generated method stub
		double max=sal[0];
		for (int j = 1; j < sal.length; j++) {
			if(sal[j]>=max){
				max=sal[j];
			}
		}
		System.out.println("Highest Salary is " + max);
		
	}
	private static void averageSalary(double[] sal) {
		// TODO Auto-generated method stub
		double avr=0;
		 double sum=0;
		 for (int j = 0; j < sal.length; j++) {
				sum+=sal[j];
			}
		System.out.println("Average Salary is " + sum/sal.length);
		
	}

}
