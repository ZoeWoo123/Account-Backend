package com.flexon.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbTest {
	
	private static final String CONN_STRING = "jdbc:mysql://localhost:8080/hello_java?";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement state = null;
		try {
			conn = DriverManager.getConnection(CONN_STRING+
				                                   "user=woo&password=123456");
			System.out.println("DB Connected");
			
			
			String query = "insert into user" + 
					" (firstName, lastName, phoneNum, emailAdd, password) " +
					" values('Alice', 'Wang', '2222222222', '67891@gmail.com','2wsx#EDC');"; 
					
			state = conn.createStatement();
			state.execute(query);
			System.out.println("Update table!");
			
		}catch(SQLException se) {
			System.err.println(se);
		}
	}

}
