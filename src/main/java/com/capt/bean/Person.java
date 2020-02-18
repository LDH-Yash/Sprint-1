package com.capt.bean;
public class Person 
{
	private String address;
	private String name;
	private long contact;
	private long aadhar;
	private String pan;
	private long dob;
	private boolean gendermale;	
	
	private String accountNumber;
	private String newName;
	private String newNum;
	private String newAddress;
	public Person(){}
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public void setNewName(String newName) 
	{
		this.newName = newName;
	}
	public void setNewNum(String newNum) 
	{
		this.newNum = newNum;
	}
	public void setNewAddress(String newAddress) 
	{
		this.newAddress = newAddress;
	}
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	public String getNewName() 
	{
		return newName;
	}
	public String getNewNum() 
	{
		return newNum;
	}
	public String getNewAddress() 
	{
		return newAddress;
	}
	public Person(String address, String name, long contact, long aadhar, String pan, long dob, boolean gendermale) 
	{
		super();
		this.address = address;
		this.name = name;
		this.contact = contact;
		this.aadhar = aadhar;
		this.pan = pan;
		this.dob = dob;
		this.gendermale = gendermale;
	}
	@Override
	public String toString() 
	{
		return "Person [address=" + address + ", name=" + name + ", contact=" + contact + ", aadhar=" + aadhar
				+ ", pan=" + pan + ", dob=" + dob + ", gendermale=" + gendermale + "]";
	}
	public String getAddress() 
	{
		return address;
	}
	public String getName() 
	{
		return name;
	}
	public long getContact() 
	{
		return contact;
	}
	public long getAadhar() 
	{
		return aadhar;
	}
	public String getPan() 
	{
		return pan;
	}
	public long getDob() 
	{
		return dob;
	}
	public boolean getIsgendermale() 
	{
		return gendermale;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setContact(long contact) 
	{
		this.contact = contact;
	}
	public void setAadhar(long aadhar) 
	{
		this.aadhar = aadhar;
	}
	public void setPan(String pan) 
	{
		this.pan = pan;
	}
	public void setDob(long dob) 
	{
		this.dob = dob;
	}
	public void setgendermale(boolean gendermale) 
	{
		this.gendermale = gendermale;
	}
}