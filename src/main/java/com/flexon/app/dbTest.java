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
				                                   "user=root&password=123456");
			System.out.println("DB Connected");
			
//			String query = "create table user(" + 
//					"   id INT NOT NULL AUTO_INCREMENT," + 
//					"   firstName VARCHAR(250)," + 
//					"   lastName VARCHAR(250)," + 
//					"   phoneNum INT, " + 
//					"   emailAdd VARCHAR(250), " + 
//					"   password VARCHAR(250), " + 
//					"   PRIMARY KEY (id )" + 
//					");";
			
			String query = "insert into user" + 
					" (firstName, lastName, phoneNum, emailAdd, password) " +
					" values('Peter', 'Pan', 1111111111, '12345@gmail.com','1qaz@WSX');"; 
					
			state = conn.createStatement();
			state.execute(query);
			System.out.println("Update table!");
			
		}catch(SQLException se) {
			System.err.println(se);
		}
	}

}
