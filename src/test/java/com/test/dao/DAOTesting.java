package com.test.dao;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capt.dao.PersonDAO;
class DAOTesting 
{
	PersonDAO d = new PersonDAO();
	@Test
	void test1_1() 
	{
		System.out.print("test1, ");
		assertFalse(d.updateAccounteeName("111111111111", ""));
	}
	@Test
	void test1_2() 
	{
		System.out.print("test1, ");
		assertFalse(d.updateAccounteeName("111111111111", "9Rakesh"));
	}
	@Test
	void test1_3() 
	{
		System.out.print("test1, ");
		assertTrue(d.updateAccounteeName("111111111111", "Rakesh"));
	}
	
	@Test
	void test2_1() 
	{
		System.out.print("test2, ");
		assertFalse(d.updateAccounteeContact("111111111111", ""));
	}
	@Test
	void test2_2() 
	{
		System.out.print("test2, ");
		assertFalse(d.updateAccounteeContact("111111111111", "abcd897932"));
	}@Test
	void test2_3() 
	{
		System.out.print("test2, ");
		assertTrue(d.updateAccounteeContact("111111111111", "9457556446"));
	}
	
	@Test
	void test3_1() 
	{
		System.out.print("test3, ");
		assertFalse(d.updateAccounteeAddress("111111111111", ""));
	}
	@Test
	void test3_2() 
	{
		System.out.print("test3, ");
		assertFalse(d.updateAccounteeAddress("111111111111", "$413, Name Street."));
	}
	@Test
	void test3_3() 
	{
		System.out.print("test3, ");
		assertTrue(d.updateAccounteeAddress("111111111111", "413, Name Street."));
	}
	
	@Test
	void test4_1() 
	{
		System.out.print("test1, ");
		assertFalse(d.updateAccounteeName("", "Ram"));
	}
	@Test
	void test4_2() 
	{
		System.out.print("test1, ");
		assertFalse(d.updateAccounteeName("44444444", "Ram"));
	}
	@Test
	void test4_3() 
	{
		System.out.print("test1, ");
		assertTrue(d.updateAccounteeName("111111111111", "Ram"));
	}
	
	@BeforeEach
	void test6()
	{
		System.out.print("Checking ");
	}
}
