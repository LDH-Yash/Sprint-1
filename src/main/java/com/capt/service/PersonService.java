package com.capt.service;
import java.util.HashMap;
import java.util.Scanner;
import com.capt.bean.Person;
import com.capt.dao.PersonDAO;
public class PersonService implements IPersonService, Validations
{
	/*
	 * 
	 *  Calling all update functions of DAO by sending new values gathered form the users...
	 * 
	 */
	PersonDAO personDAO = new PersonDAO();
	Scanner sc = new Scanner(System.in);
	Person person = new Person();
	String message = "Enter the Account Number";
	@Override
	public boolean updateName()
	{
		System.out.println(message);
		person.setAccountNumber(sc.next());
		System.out.println("Enter Accountee's New Name");
		person.setNewName(sc.next());
		if(Validations.validatedata(person.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(person.getNewName(), Validations.newNameValidator))
			{
				if(personDAO.updateAccounteeName(person.getAccountNumber(),person.getNewName()))
				{
					System.out.println("Name is Updated...");
					return true;
				}
			}
			else
			{
				System.out.println("Name should be in alphabets only.");
				return false;
			}
		}
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
			return false;
		}
		return false;
	}
	@Override
	public boolean updateContact()
	{
		System.out.println(message);
		person.setAccountNumber(sc.next());
		System.out.println("Enter the new Contact Number");
		person.setNewNum(sc.next());
		if(Validations.validatedata(person.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(person.getNewNum(), Validations.newContactNoValidator))
			{
				if(personDAO.updateAccounteeContact(person.getAccountNumber(), person.getNewNum()))
				{
					System.out.println("Contact Number is Updated...");
					return true;
				}
			}
			else
			{
				System.out.println("Contact Number should be Valid.");
				return false;
			}
		}	
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
			return false;
		}
		return false;
	}
	@Override
	public boolean updateAddress()
	{
		System.out.println(message);
		person.setAccountNumber(sc.next());
		System.out.println("Enter the New Address");
		person.setNewAddress(sc.next());
		if(Validations.validatedata(person.getAccountNumber(), Validations.accountNumber))
		{
			if(Validations.validatedata(person.getNewAddress(), Validations.newAddressValidator))
			{
				if(personDAO.updateAccounteeAddress(person.getAccountNumber(), person.getNewAddress()))
				{
					System.out.println("Address is Updated...");
					return true;
				}
			}
			else
			{
				System.out.println("Address should be Valid.");
				return false;
			}
		}
		else
		{
			System.out.println("Account Number should be valid(a 12 digit number).");
			return false;
		}
		return false;
	}
	@Override
	public HashMap<String, Person> showAllData()
	{
		return personDAO.showAllAccountiees();
	}
}