package com.flexon.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private String Email;
	private String Password;
	private String Name;
	private String Birthday;
	private String Gender;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) throws MyException {
		if(!email.matches("^(.+)@(.+)$")) {
			throw new MyException("Input email not valid!");
		}
		this.Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword (String password) throws MyException {
		if(!password.matches("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})")){
			throw new MyException("Input Password not valid!");
		}
		this.Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) throws MyException {
		if(!name.matches("^[_a-zA-Z0-9]{6,18}$")) {
			throw new MyException("Input UserName not valid!");
		}
		Name = name;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) throws MyException{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String today = dateFormat.format(new Date());
		if(today.compareTo(birthday) <= 0) {
			throw new MyException("Input date not valid");
		}
		this.Birthday = birthday;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
}
