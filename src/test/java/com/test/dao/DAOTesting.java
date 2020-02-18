package com.test.dao;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capt.dao.DAOClass;
class DAOTesting 
{
	DAOClass d = new DAOClass();
	@Test
	void test() 
	{
		assertTrue(d.updateAccounteeName("1", "Ram"));
	}
	@Test
	void test1() 
	{
		assertTrue(d.updateAccounteeContact("1", "9457556446"));
	}
	@Test
	void test2() 
	{
		assertTrue(d.updateAccounteeAddress("1", "Ram"));
	}
	@Test
	void test3() 
	{
		assertFalse(d.updateAccounteeName("1", "123"));
	}
	@Test
	void test4() 
	{
		assertFalse(d.updateAccounteeContact("1", "Ram"));
	}
	@Test
	void test5() 
	{
		assertFalse(d.updateAccounteeAddress("1", "123"));
	}
	@BeforeEach
	void test6()
	{
		System.out.println("Ok, test case passed");
	}
}
