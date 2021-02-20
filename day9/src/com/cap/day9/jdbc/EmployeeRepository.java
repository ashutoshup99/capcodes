package com.cap.day9.jdbc;
import java.sql.*;

public class EmployeeRepository {

	public static void main(String[] args) {
		
		Connection connection = null;
          try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/WorkDb1","postgres","ashuAlok1");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
            Statement stmt=connection.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM public.\"Employee\"");  
			
//			4. Extract the result from query
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
			
//			5. Close the connection to database
			connection.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
