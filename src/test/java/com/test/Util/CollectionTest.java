package com.test.Util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.capt.bean.Person;
import com.capt.util.RepositoryStorage;

class CollectionTest 
{
	static HashMap<String, Person> hm = new HashMap<String, Person>();
	RepositoryStorage t1 = new RepositoryStorage();
	public static void dummyData() 
	{
		Person p1 = new Person("383 Avas Vikas Bijnor", "Yash", 8979324667l, 111111111111l, "adqa1234adsa", 19981001, true);
		Person p2 = new Person("384 Avas Vikas Bijnor", "Ram", 8979324668l, 222222222222l, "adqa5678adsa", 19981001, true);
		Person p3 = new Person("385 Avas Vikas Bijnor", "Sita", 8979324669l, 333333333333l, "adqa9101adsa", 19981001, false);	
		hm.put("111111111111", p1);
		hm.put("222222222222", p2);
		hm.put("333333333333", p3);
	}
	@Test
	void test()
	{
		System.out.print("test1 :");
		assertTrue(!t1.getHashMap().isEmpty());
	}
	@Test
	void test1()
	{
		dummyData();
		System.out.print("test2 :");
		assertEquals("Yash", t1.getHashMap().get("111111111111").getName());
	}
	@Test
	void test2() 
	{
		dummyData();
		System.out.print("test3 :");
		assertEquals(hm.get("111111111111").getContact(), t1.getHashMap().get("111111111111").getContact());
	}
	@AfterEach
	void test3()
	{
		System.out.println(" Ok, test case passed");
	}
}
