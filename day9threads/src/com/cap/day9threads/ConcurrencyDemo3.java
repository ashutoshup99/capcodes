package com.cap.day9threads;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class ConcurrencyDemo3 {
public static void main(String[] args) {
		
		Employee e1 = new Employee(12, "Ravi", 1000.34);
		Employee e2 = new Employee(2, "Priya", 5000.44);
		Employee e3 = new Employee(12, "Arijit", 7000.55);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		
		employees.add(e2);
		employees.add(e3);
		
		// Pool of 2 threads
		ExecutorService service = new ThreadPoolExecutor(2, 4, 0,TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
				
				//Executors.newFixedThreadPool(2);
		
		for(Employee e : employees) {
			// No thread creation here
			Runnable r = new VaccinationTask(e);
			e.incrementSalary();
			service.submit(r);
		}
		
		service.shutdown();

	}


}
