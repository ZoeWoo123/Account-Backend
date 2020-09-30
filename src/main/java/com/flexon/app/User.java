package com.flexon.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private int phoneNum;
	private String emailAdd;
	private String password;
	
	public User() {
		
	}
	public User(String e, String p, String fn, String ln, int pn) {
		this.id = -1;
		this.emailAdd = e;
		this.password = p;
		this.firstName = fn;
		this.lastName = ln;
		this.phoneNum = pn;
	}
	
	public int getId() {
		return this.id;
	}
	
	public boolean setId(int num) {
		if(num <= 0) {
			return false;
		}
		this.id = num;
		return true;
	}
	
	public String getEmail() {
		return emailAdd;
	}
	
	public boolean setEmail(String email){
		if(!email.matches("^(.+)@(.+)$")) {
			return false;
		}
		this.emailAdd = email;
		return true;
	}
	
	public String getPassword() {
		return password;
	}
	public boolean setPassword (String password){
		if(!password.matches("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})")){
			return false;
		}
		this.password = password;
		return true;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public boolean setFirstName(String name){
		if(name != null && name.length() > 0) {
			this.firstName = name;
			return true;
		}
		return false;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public boolean setLastName(String name) {
		if(name != null && name.length() > 0) {
			this.firstName = name;
			return true;
		}
		return false;
	}
	
	public int getPhoneNum() {
		return this.phoneNum;
	}
	public boolean setPhoneNum(int num) {
		if(String.valueOf(num).length() != 10){
			return false;
		}
		this.phoneNum = num;
		return true;
	}
	
}
