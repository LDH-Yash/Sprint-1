package com.capt.ui;
import java.util.Scanner;
import com.capt.service.ServiceClass;
public class MainClassUpdateDetails 
{
	static ServiceClass s = new ServiceClass();
	static String menu;
	static Scanner sc = new Scanner(System.in);
	public static void switchCase()
	{
		boolean b=true;
		while(b)
		{
			System.out.println("What do you want to update\n1. Customer Name\n2. Customer Contact\n3. Customer Address\n4. Show All the Data\nOr Press any key to exit...");
			menu = sc.next();
			switch (menu) 
			{
				case "1":
				{
					System.out.println("Edit name");
					s.updateName();
					break;
				}
				case "2":
				{
					System.out.println("Edit contact");
					s.updateContact();
					break;
				}
				case "3":
				{
					System.out.println("Edit address");
					s.updateAddress();
					break;
				}
				case "4":
				{
					System.out.println("Showing All the data");
					s.showAllData();
					break;
				}
				default:
				{
					System.out.println("Good Bye...");
					sc.close();
					b=false;
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Account Update Menu:");
		switchCase();
	}
}
