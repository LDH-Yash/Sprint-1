package com.capt.exception;

public class MenuInputException extends Exception 
{	
	/*
	 *Exception Handling for main menu 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "WrongInput";
	}
}
