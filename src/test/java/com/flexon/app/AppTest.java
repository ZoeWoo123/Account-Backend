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
}
