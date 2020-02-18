package com.capt.dao;
public interface DAOInterface 
{
	void updateAccounteeName(String accountId, String name);
	void updateAccounteeContact(String accountId, String contactNo);
	void updateAccounteeAddress(String accountId, String address);
	void showAllAccountiees();
}
