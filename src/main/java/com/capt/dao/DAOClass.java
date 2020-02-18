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
	public boolean updateAccounteeName(String accountId, String name) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setName(name);
				return true;
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
			return false;
		}
	}
	@Override
	public boolean updateAccounteeContact(String accountId,String contactNo) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setContact(Long.parseLong(contactNo));
				return true;
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
			return false;
		}
	}
	@Override
	public boolean updateAccounteeAddress(String accountId, String address) 
	{
		try 
		{
			if(d.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				d.getHashMap().get(accountId).setAddress(address);
				return true;
			}
			else
			{
				throw new IDNotFound();
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
			return false;
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