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
	@Override
	public void updateAccounteeName(String a_Id, String name) 
	{
		try 
		{
			if(d.getHashMap().containsKey(a_Id))
			{
				System.out.println("ID Found");
				d.getHashMap().get(a_Id).setName(name);
				System.out.println("Name is Updated...");
			}
			else
			{
				throw new IDNotFound(a_Id);
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
		}
	}
	@Override
	public void updateAccounteeContact(String a_Id,String c_No) 
	{
		try 
		{
			if(d.getHashMap().containsKey(a_Id))
			{
				System.out.println("ID Found");
				d.getHashMap().get(a_Id).setContact(Long.parseLong(c_No));
				System.out.println("Contact Number is Updated...");
			}
			else
			{
				throw new IDNotFound(a_Id);
			}
		} 
		catch (IDNotFound e) 
		{
			System.out.println(e);
		}
	}
	@Override
	public void updateAccounteeAddress(String a_Id, String address) 
	{
		try 
		{
			if(d.getHashMap().containsKey(a_Id))
			{
				System.out.println("ID Found");
				d.getHashMap().get(a_Id).setAddress(address);
				System.out.println("Address is Updated...");
			}
			else
			{
				throw new IDNotFound(a_Id);
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