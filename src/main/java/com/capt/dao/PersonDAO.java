package com.capt.dao;
import java.util.HashMap;
import java.util.Scanner;
import com.capt.bean.Person;
import com.capt.exception.*;
import com.capt.util.RepositoryStorage;
public class PersonDAO implements IPersonDAO
{
	
	/*
	 * 
	 * All inportant back-end functioning...
	 *
	 */
	
	Scanner sc = new Scanner(System.in);
	RepositoryStorage data = new RepositoryStorage();
	String message = "ID Found";
	String message1 = "ID not found";
	@Override
	public boolean updateAccounteeName(String accountId, String name) 
	{
		try 
		{
			if(data.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				data.getHashMap().get(accountId).setName(name);
				return true;
			}
			else
			{
				//throw new IDNotFound();
				throw new IDNotFound(message1);
			}
		} 
		catch (IDNotFound e) 
		{
			//System.out.println(e);
			System.out.println(e.getMessage());
			return false;
		}
	}
	@Override
	public boolean updateAccounteeContact(String accountId,String contactNo) 
	{
		try 
		{
			if(data.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				data.getHashMap().get(accountId).setContact(Long.parseLong(contactNo));
				return true;
			}
			else
			{
				//throw new IDNotFound();
				throw new IDNotFound(message1);
			}
		} 
		catch (IDNotFound e) 
		{
			//System.out.println(e);
			System.out.println(e.getMessage());
			return false;
		}
	}
	@Override
	public boolean updateAccounteeAddress(String accountId, String address) 
	{
		try 
		{
			if(data.getHashMap().containsKey(accountId))
			{
				System.out.println(message);
				data.getHashMap().get(accountId).setAddress(address);
				return true;
			}
			else
			{
				//throw new IDNotFound();
				throw new IDNotFound(message1);
			}
		} 
		catch (IDNotFound e) 
		{
			//System.out.println(e);
			System.out.println(e.getMessage());
			return false;
		}
	}
	@Override
	public HashMap<String, Person> showAllAccountiees()
	{
		return data.getHashMap();
	}
}