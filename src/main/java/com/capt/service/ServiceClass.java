package com.capt.service;
import java.util.Scanner;
import com.capt.bean.Person;
import com.capt.dao.DAOClass;
public class ServiceClass implements ServiceInterface, Validations
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
		if(Validations.validatedata(p.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(p.getNewName(), Validations.newNameValidator))
			{
				if(d.updateAccounteeName(p.getAccountNumber(),p.getNewName()))
				{
					System.out.println("Name is Updated...");
				}
			}
			else
			{
				System.out.println("Name should be in alphabets only.");
			}
		}
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
		}
	}
	@Override
	public void updateContact()
	{
		System.out.println(message);
		p.setAccountNumber(sc.next());
		System.out.println("Enter the new Contact Number");
		p.setNewNum(sc.next());
		if(Validations.validatedata(p.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(p.getNewNum(), Validations.newContactNoValidator))
			{
				if(d.updateAccounteeContact(p.getAccountNumber(), p.getNewNum()))
				{
					System.out.println("Contact Number is Updated...");
				}
			}
			else
			{
				System.out.println("Contact Number should be Valid.");
			}
		}
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
		}
	}
	@Override
	public void updateAddress()
	{
		System.out.println(message);
		p.setAccountNumber(sc.next());
		System.out.println("Enter the New Address");
		p.setNewAddress(sc.next());
		if(Validations.validatedata(p.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(p.getNewAddress(), Validations.newAddressValidator))
			{
				if(d.updateAccounteeAddress(p.getAccountNumber(), p.getNewAddress()))
				{
					System.out.println("Address is Updated...");
				}
			}
			else
			{
				System.out.println("Address should be Valid.");
			}
		}
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
		}
	}
	@Override
	public void showAllData()
	{
		d.showAllAccountiees();
	}
}