package com.test.service;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.capt.service.PersonService;

class ServiceTesting {

	@Test
	void test() {
		PersonService s = new PersonService();
		assertTrue(s.updateName());
	}
	@Test
	void test1() {
		PersonService s = new PersonService();
		assertTrue(s.updateContact());
	}
	@Test
	void test2() {
		PersonService s = new PersonService();
		assertTrue(s.updateAddress());
	}
}
