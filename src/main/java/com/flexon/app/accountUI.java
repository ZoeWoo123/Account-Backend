package com.flexon.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class accountUI {
	
	static User user = new User();
	public static void testEmail() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input an email:");
		String userEmail = myObj.nextLine();
		if(user.setEmail(userEmail)) {
			System.out.println("Email Done");
		}else {
			System.out.println("Email Error");
		}
	}
	
	public static void testFirstName() {
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Please input your first name:");
		String firstName = myObj1.nextLine();
		if(user.setFirstName(firstName)) {
			System.out.println("FirstName Done");
		} else{
			System.out.println("FirstName Error");
		}
	}
	
	public static void testLastName() {
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Please input your last name:");
		String lastName = myObj2.nextLine();
		if(user.setLastName(lastName)) {
			System.out.println("LastName Done");
		}else {
			System.out.println("LastName Error");
		}
	}
	
	public static void testPassword() {
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Please input your password:");
		String userPassword = myObj3.nextLine();
		if(user.setPassword(userPassword)) {
			System.out.println("Password Done");
		} else{
			System.out.println("Password Error");
		}
	}
	
	public static void testPhoneNum() {
		Scanner myObj4 = new Scanner(System.in);
		System.out.println("Please input your phone number:");
		int phoneNum = myObj4.nextInt();
		if (user.setPhoneNum(phoneNum)) {
			System.out.println("PhoneNum Done");
		} else{
			System.out.println("PhoneNum Error");
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		//Test Email
		testEmail();
		
		//Test First Name
		testFirstName();
		
		//Test Last Name
		testLastName();
		
		//Test Password
		testPassword();
		
		//Test PhoneNum
		testPhoneNum();
	}

	

	

}
