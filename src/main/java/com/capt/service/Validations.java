package com.capt.service;

public interface Validations 
{
	String accountNumber="[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	String newNameValidator="[a-zA-Z].*";
	String newContactNoValidator = "[1-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
	String newAddressValidator = "[A-Za-z].*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}
}
