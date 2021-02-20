package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	public static Connection getConnection() {
		Connection connection = null;
		try {
//			1. Load the driver
			Class.forName("org.postgresql.Driver");  
			
//			2. Create a connection to database
	        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/WorkDb1","postgres","ashuAlok1");

			System.out.println("Connected to database");	
		}
		catch(Exception e) {
			System.out.println("Connection couldn't be established");
			e.printStackTrace();
		}
		return connection;
	}
	public List<Employee> findAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try {
			
			Connection connection = getConnection();

//			3. Fire a sql query
			Statement stmt=connection.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM public.\"Employee\"");  
			
			
//			4. Extract the result from query
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String salaryStr = rs.getString(3);
				System.out.println(id+"  "+ name +"  "+salaryStr); 
				Employee e = new Employee(id, name, Double.parseDouble(salaryStr));
				System.out.println(e);
				employees.add(e);
			}
				
			
//			5. Close the connection to database
			connection.close();  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
	}
	public int addEmployee(Employee emp) {
		Connection connection = getConnection();
		int count = 0;
		try {
//			3. Fire a sql query
			PreparedStatement stmt = connection.prepareStatement("insert into employee values(?,?,?)"); 
			stmt.setInt(1, emp.getId());
			stmt.setString(2, emp.getName());
			stmt.setString(3, "" + emp.getSalary());
			count = stmt.executeUpdate();
			return count;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
