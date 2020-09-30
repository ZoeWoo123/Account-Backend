package com.flexon.app;

import static org.junit.Assert.*;

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
    	User user = new User();
    	boolean ret = user.setEmail("1234@gmail.com");
    	assertEquals(ret, true);
    }
    
    @Test
    public void tryFirstName() {
    	User user = new User();
    	boolean ret = user.setFirstName("");
    	assertEquals(ret, false);
    }
    
    @Test
    public void tryLastName() {
    	User user = new User();
    	boolean ret = user.setLastName("Wu");
    	assertEquals(ret, true);
    }
    
    @Test
    public void tryPassword() {
    	User user = new User();
    	boolean ret = user.setPassword("123456");
    	assertEquals(ret, false);
    }
    
    @Test
    public void tryPhoneNum() {
    	User user = new User();
    	boolean ret = user.setPhoneNum(1111111111);
    	assertEquals(ret, true);
    	int num = user.getPhoneNum();
    	assertEquals(num, 1111111111);
    }
    
    @Test
    public void tryDao() {
		UserDao tryDao = new UserDao();
		User user1 = new User("123@gmail.com", "1qaz@WSX", "Peter", "Wu",1111111111);
		assertTrue(tryDao.addUser(user1));
		tryDao.printUser();
		assertTrue(tryDao.updateUser(user1, "Password", "2wsx#EDC"));
		
		try {
			tryDao.removeUser(user1);
			System.out.println("Remove Done");
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		
    }
}
