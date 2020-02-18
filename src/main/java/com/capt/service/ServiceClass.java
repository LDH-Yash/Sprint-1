package com.capt.service;
import java.util.Scanner;
import com.capt.bean.Person;
import com.capt.dao.DAOClass;
public class ServiceClass implements ServiceInterface   
{
	DAOClass d = new DAOClass();
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	String message = "Enter the Account Number";
	@Override
	public void updateName()
	{
		System.out.println(message);
		p.setAccountNumber(sc.next());
		System.out.println("Enter Accountee's New Name");
		p.setNewName(sc.next());
		if(d.updateAccounteeName(p.getAccountNumber(),p.getNewName()))
		{
			System.out.println("Name is Updated...");
		}
	}
	@Override
	public void updateContact()
	{
		System.out.println(message);
		p.setAccountNumber(sc.next());
		System.out.println("Enter the new Contact Number");
		p.setNewNum(sc.next());
		if(d.updateAccounteeContact(p.getAccountNumber(), p.getNewNum()))
		{
			System.out.println("Contact Number is Updated...");
		}
	}
	@Override
	public void updateAddress()
	{
		System.out.println(message);
		p.setAccountNumber(sc.next());
		System.out.println("Enter the New Address");
		p.setNewAddress(sc.next());
		if(d.updateAccounteeAddress(p.getAccountNumber(), p.getNewAddress()))
		{
			System.out.println("Address is Updated...");
		}
	}
	@Override
	public void showAllData()
	{
		d.showAllAccountiees();
	}
}