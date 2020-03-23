package com.capt.service;

import java.util.HashMap;

import com.capt.bean.Person;

public interface IPersonService 
{
	/*
	 * 
	 *	Securing my Service data & Methods...
	 * 
	 */
	boolean updateName();
	boolean updateContact();
	boolean updateAddress();
	HashMap<String, Person> showAllData();
}
