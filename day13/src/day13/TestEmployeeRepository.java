package day13;
import static org.junit.Assert.assertSame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeRepository {

static EmployeeRepository repository;
	
	@BeforeClass
	public static void setup() {
		repository = new EmployeeRepository();
	}

	@Test
	public void testFindAllEmployees() {
		List<Employee> employees = repository.findAllEmployees();
		System.out.println(employees);
		assertSame(4, employees.size());
	}
	
//	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(23, "Rahul", 34343.34);
		int count = repository.addEmployee(emp);
		assertSame(1, count);
	}
//	@Test
//	public void testDeleteEmployee() {
////		Employee emp = new Employee(23, "Rahul", 34343.34);
//		int id=23;
//		int count = repository.DeleteEmployee(id);
//		assertSame(1, count);
//	}
//	
	
	// Delete a employee by id
	
	// Find a employee be id;
	
	// Update the name of the employee

}
