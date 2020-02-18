package com.capt.dao;
public interface DAOInterface 
{
	boolean updateAccounteeName(String accountId, String name);
	boolean updateAccounteeContact(String accountId, String contactNo);
	boolean updateAccounteeAddress(String accountId, String address);
	void showAllAccountiees();
}
