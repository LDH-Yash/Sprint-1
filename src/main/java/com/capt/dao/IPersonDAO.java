package com.capt.dao;

import java.util.HashMap;

import com.capt.bean.Person;

public interface IPersonDAO 
{
	/*
	 * 
	 * securing all my DAO methods...
	 * 
	 */
	boolean updateAccounteeName(String accountId, String name);
	boolean updateAccounteeContact(String accountId, String contactNo);
	boolean updateAccounteeAddress(String accountId, String address);
	HashMap<String, Person> showAllAccountiees();
}
