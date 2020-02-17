package com.capt.dao;
public interface DAOInterface 
{
	void updateAccounteeName(String a_Id, String name);
	void updateAccounteeContact(String a_Id, String c_No);
	void updateAccounteeAddress(String a_Id, String address);
	void showAllAccountiees();
}
