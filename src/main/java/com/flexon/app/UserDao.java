package com.flexon.app;

import java.util.*;


public class UserDao {
	private List<User> userData = new ArrayList<>();
	
	public boolean addUser(User user) {
		return userData.add(user);
	}
	
	public void removeUser(User user) throws Exception{
		if(user == null) {
			throw new NullPointerException();
		}
		for(int i = 0; i < userData.size(); i++) {
			if(userData.get(i).getId() == user.getId()){
				userData.remove(i);
			}
		}
	}
	
	public void printUser() {
		for(User u:userData) {
			int idx = 0;
			System.out.println(idx + " " + u.getId());
		}
	}
	
	public boolean updateUser (User user, String title, String content){
		for(User u:userData) {
			if(u.getEmail().equals(user.getEmail())) {
				switch(title) {
				case "FirstName":
					u.setFirstName(content);
					return true;
				case "LastName":
					u.setLastName(content);
					return true;
				case "Password":
					u.setPassword(content);
					return true;
				case "Email":
					u.setEmail(content);
					return true;
				case "PhoneNum":
					u.setPhoneNum(Integer.parseInt(content));
					return true;

				}
			}
			
		}
		return false;
	}
}
