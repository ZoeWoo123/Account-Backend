package com.flexon.app;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void tryEmail() {
    	try{
    		User user = new User();
    		user.setEmail("123456");
    	}catch(MyException ex){
    		System.out.println(ex.getMessage());
    	}
    }
    
    @Test
    public void tryName() {
    	try {
    		User user = new User();
    		user.setName("**");
    	}catch(MyException ex) {
    		System.out.println(ex.getMessage());
    	}
    }
    
    @Test
    public void tryBirthday() {
    	try {
    		User user = new User();
    		String testDate = "2020-09-24";
    		user.setBirthday(testDate);
    	}catch(MyException ex) {
    		System.out.println(ex.getMessage());
    	}
    }
    
    @Test
    public void tryPassword() {
    	try {
    		User user = new User();

    		user.setPassword("123456");
    	}catch(MyException ex) {
    		System.out.println(ex.getMessage());
    	}
    }
    
    @Test
    public void tryDao() {
		UserDao tryDao = new UserDao();
		User user1 = new User("123@gmail.com", "1qaz@WSX", "Woo663", "1996-06-01","Female");
		assertTrue(tryDao.addUser(user1));
		tryDao.printUser();
		try {
			tryDao.updateUser(user1, "Password", "2wsx#EDC");
			System.out.println("Update Done");
		}catch(MyException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			tryDao.removeUser(user1);
			System.out.println("Remove Done");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
    }
}
