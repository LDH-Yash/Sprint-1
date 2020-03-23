package com.test.bean;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.capt.bean.Person;

class BeanTesting 
{
	Person p = new Person();
	@Test
	void test() 
	{
		assertTrue(!p.toString().isEmpty());
	}
}
