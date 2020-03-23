package com.capt.exception;
public class IDNotFound extends Exception
{
	/*
	 *
	 * Exception Handling
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() 
	{
		return "ID Not Found";
	}
	
	public IDNotFound(String msg) 
	{
		super(msg);
	}
	
}