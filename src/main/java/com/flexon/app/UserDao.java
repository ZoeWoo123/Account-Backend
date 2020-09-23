package com.flexon.app;

import java.util.*;


public class UserDao {
	private List<User> userData = new ArrayList<>();
	
	public boolean addUser(User user) {
		return userData.add(user);
	}
	
	public void removeUser(User user) throws Exception{
		if(user.getEmail() == null) {
			throw new NullPointerException();
		}
		for(int i = 0; i < userData.size(); i++) {
			if(userData.get(i).getEmail().equals(user.getEmail())){
				userData.remove(i);
			}
		}
	}
	
	public void printUser() {
		for(User u:userData) {
			int idx = 0;
			System.out.println(idx + " " + u.getName());
		}
	}
	
	public void updateUser (User user, String title, String content) throws MyException{
		for(User u:userData) {
			if(u.getEmail().equals(user.getEmail())) {
				switch(title) {
				case "Birthday":
					try{
						u.setBirthday(content);
						break;
					}catch(MyException ex){
			    		System.out.println(ex.getMessage());
					}
				case "Email":
					try{
						u.setEmail(content);
						break;
					}catch(MyException ex){
			    		System.out.println(ex.getMessage());
					}
				case "Gender":
					try{
						u.setGender(content);
						break;
					}catch(Exception ex){
			    		System.out.println(ex.getMessage());
					}
				case "Name":
					try{
						u.setName(content);
						break;
					}catch(MyException ex){
			    		System.out.println(ex.getMessage());
					}
				case "Password":
					try{
						u.setPassword(content);
						break;
					}catch(MyException ex){
			    		System.out.println(ex.getMessage());
					}
				}
			}
			
		}
	}
}
