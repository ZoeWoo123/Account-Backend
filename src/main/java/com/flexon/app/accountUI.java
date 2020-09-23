package com.flexon.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class accountUI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		//Test Email
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input an email:");
		String userEmail = myObj.nextLine();
		try {
			user.setEmail(userEmail);
			System.out.println("Email Done");
		} catch(MyException ex){
			System.out.println(ex.getMessage());
		}
			
		//Test Name
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Please input your username:");
		String userName = myObj1.nextLine();
		try {
			user.setName(userName);
			System.out.println("Username Done");
		} catch(MyException ex){
			System.out.println(ex.getMessage());
		}
		
		//Test Gender
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Please input your gender:");
		String userGender = myObj2.nextLine();
		try {
			user.setGender(userGender);
			System.out.println("Gender Done");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		//Test Password
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Please input your password:");
		String userPassword = myObj3.nextLine();
		try {
			user.setPassword(userPassword);
			System.out.println("Password Done");
		} catch(MyException ex){
			System.out.println(ex.getMessage());
		}
		
		//Test Birthday
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("Please input your birthday:");
		String userBirthday = myObj4.nextLine();
		try {
			user.setBirthday(userBirthday);
			System.out.println("Birthday Done");
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		} 
	}

	

}
