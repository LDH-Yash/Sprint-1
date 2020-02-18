package com.capt.dao;
import java.util.Map;
import java.util.Scanner;
import com.capt.bean.Person;
import com.capt.exception.*;
import com.capt.util.DummyData;
public class DAOClass implements DAOInterface
{
	Scanner sc = new Scanner(System.in);
	DummyData d = new DummyData();
	String message = "ID Found";
	@Override
	public void updateAccounteeName(String accountId, String name) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setName(name);
				System.out.println("Name is Updated...");
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
		}
	}
	@Override
	public void updateAccounteeContact(String accountId,String contactNo) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setContact(Long.parseLong(contactNo));
				System.out.println("Contact Number is Updated...");
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
		}
	}
	@Override
	public void updateAccounteeAddress(String accountId, String address) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setAddress(address);
				System.out.println("Address is Updated...");
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
		}
	}
	@Override
	public void showAllAccountiees()
	{
		for(Map.Entry<String, Person> m:d.getHashMap().entrySet())
		{
			System.out.println("||\t" + m.getKey() +"\t||\t" + m.getValue() + "\t||");
		}
	}
}