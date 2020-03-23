package com.capt.ui;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capt.bean.Person;
import com.capt.exception.MenuInputException;
import com.capt.service.PersonService;
public class MainUI 
{
	/*
	 * 
	 * 	Main class for calling all the functionality...
	 * 
	 */
	
	PersonService personService = new PersonService();
	String menu;
	Scanner sc = new Scanner(System.in);
	public void switchCase()
	{
		boolean b=true;
		while(b)
		{
			System.out.println("What do you want to update\n1. Customer Name\n2. Customer Contact\n3. Customer Address\n4. Show All the Data\nOr Enter 5 to exit...");
			try 
			{
				menu = sc.next();
				if(!(menu.equals("1") || menu.equals("2") || menu.equals("3") || menu.equals("4") || menu.equals("5")))
				{
					throw new MenuInputException();
				}
			} 
			catch (MenuInputException e) 
			{
				System.out.println(e);
			}
			switch (menu) 
			{
				case "1":
				{
					System.out.println("Edit name");
					personService.updateName();
					break;
				}
				case "2":
				{
					System.out.println("Edit contact");
					personService.updateContact();
					break;
				}
				case "3":
				{
					System.out.println("Edit address");
					personService.updateAddress();
					break;
				}
				case "4":
				{
					System.out.println("Showing All the data");
					HashMap<String, Person> hm = personService.showAllData();
					for(Map.Entry<String, Person> m:hm.entrySet())
					{
						System.out.println("||\t" + m.getKey() +"\t||\t" + m.getValue() + "\t||");
					}
					break;
				}
				case "5":
				{
					System.out.println("Good Bye...");
					b=false;
					break;
				}
				default:
				{
					System.out.println("Please re-type the input from the menu: \n");
					break;
				}
			}
		}
		sc.close();
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Account Update Menu:");
		MainUI m =new MainUI();
		m.switchCase();
	}
}
