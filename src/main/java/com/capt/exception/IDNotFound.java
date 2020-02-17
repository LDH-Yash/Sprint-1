package com.capt.exception;

public class IDNotFound extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String a;
	public IDNotFound(String b) 
	{
		a=b;
	}
	@Override
	public String toString() {
		return "ID Not Found = " + a ;
	}
}