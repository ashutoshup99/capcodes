package com.cap.day9threads;
import java.util.ArrayList;
import java.util.List;

//import com.cap.day8.Employee;
	class VaccinationTask implements Runnable{
		Employee employee;
		
		public VaccinationTask(Employee employee) {
			this.employee = employee;
		}
		@Override
		public void run() {
			// induce a 5 sec delay to simulate time lag in each vaccination
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(employee +  " Vaccinated... by: " + Thread.currentThread().getName());
		}
		}	
	public class Threadsdemo2 {
		
		public static void vaccinate(Employee employee) {
			// induce a 5 sec delay to simulate time lag in each vaccination
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(employee +  " Vaccinated... by: " + Thread.currentThread().getName());
		}

		public static void main(String[] args) {
			
//			Employee emp = new Employee(12, "Ravi", 34344.34);
			
			Employee e1 = new Employee(1, "Ravi", 34343.34);
			Employee e2 = new Employee(2, "Priya", 44343.34);
			Employee e3 = new Employee(3, "Arijit", 24343.34);

			
			List<Employee> employees = new ArrayList<>();
			employees.add(e1); 
			employees.add(e2);
			employees.add(e3);
			
			for(Employee emp: employees) {
				Runnable r = new VaccinationTask(emp);
				// parallel activity ... process all at once..
				Thread t = new Thread(r);
				t.start();
				
				// sequential activity.. one by one processing
//				vaccinate(emp);
			}
			
			System.out.println("End of main method: " + Thread.currentThread().getName());
			
			
		}

}

	
	
	
	
	
	
	
	
	
//	Employee e4 = new Employee(4, "Arijit", 24343.34);
//	Employee e5 = new Employee(5, "Arijit", 24343.34);
//	Employee e6 = new Employee(6, "Arijit", 24343.34);
//	Employee e7 = new Employee(7, "Arijit", 24343.34);
//	Employee e8 = new Employee(12, "Arijit", 24343.34);
//	Employee e9 = new Employee(12, "Arijit", 24343.34);
//	Employee e10 = new Employee(12, "Arijit", 24343.34);
