package com.flexon.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;


public class UserDao {
	private static final String CONN_STRING = "jdbc:mysql://localhost:8080/hello_java?";
	private Connection conn = null;
	private Statement state = null;
	
	public UserDao() {
		try {
			conn = DriverManager.getConnection(CONN_STRING+
				                                   "user=woo&password=123456");
			System.out.println("DB Connected");
		}catch (SQLException se) {
			System.err.println(se);
		}
	}
	
	public void addUser(User user) {
		try {
			state = conn.createStatement();
			String query = "insert into user (firstName, lastName, phoneNum, emailAdd, password)" + 
			"values (\"" + user.getFirstName() + "\",\"" + user.getLastName() + "\",\"" + user.getPhoneNum() + "\",\"" + user.getEmail() + "\",\"" + user.getPassword() + "\");";
			state.execute(query);
			System.out.println("Add Done!");
		}catch(SQLException se) {
			System.err.println(se);
		}
		
	}
	
	public void removeUser(String col, String val){
		try {
			state = conn.createStatement();
			String query = "delete from user where " + col + " = \"" + val + "\";"; 
			state.execute(query);
			System.out.println("Delete Done!");
		}catch(SQLException se) {
			System.err.println(se);
		}
	}
	
	public void removeUser(String col, int val){
		try {
			state = conn.createStatement();
			String query = "delete from user where " + col + " = " + val + ";"; 
			state.execute(query);
			System.out.println("Delete Done!");
		}catch(SQLException se) {
			System.err.println(se);
		}
	}
	
	public void printUser() {
		try {
			state = conn.createStatement();
			String query = "Select * from user;"; 
			ResultSet rs = state.executeQuery(query);
			while(rs.next()){
				int id  = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNum = rs.getString("phoneNum");
				String emailAdd = rs.getString("emailAdd");
				
				System.out.print("ID: " + id);
				System.out.print(", First Name: " + firstName);
				System.out.print(", Last Name: " + lastName);
				System.out.print(", Phone: " + phoneNum);
				System.out.println(", Email: " + emailAdd);
		     }
		     rs.close();
		}catch(SQLException se) {
			System.err.println(se);
		}
	}
	
	public void updateUser (String updateCol, String updateVal, String col, String val){
		try {
			state = conn.createStatement();
			String query = "update user set " + updateCol + " = \"" + updateVal + "\" where " + col + " = \"" + val + "\";"; 
			state.execute(query);
			System.out.println("Update Done!");
		}catch(SQLException se) {
			System.err.println(se);
		}
	}
	
	public void updateUser (String updateCol, String updateVal, String col, int val){
		try {
			state = conn.createStatement();
			String query = "update user set " + updateCol + " = \"" + updateVal + "\" where " + col + " = " + val + ";"; 
			state.execute(query);
			System.out.println("Update Done!");
		}catch(SQLException se) {
			System.err.println(se);
		}
	}
	
		
}
