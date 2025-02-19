package com.capt.util;
import java.util.HashMap;
import com.capt.bean.Person;
public class RepositoryStorage implements ICollectedData
{
	/*
	 * 
	 * Storing data and some dummy data is stored here...
	 * 
	 */
	
	HashMap<String, Person> accounts = new HashMap<String, Person>();
	Person p1 = new Person("383 Avas Vikas Bijnor", "Yash", 8979324667l, 111111111111l, "adqa1234adsa", 19981001, true);
	Person p2 = new Person("384 Avas Vikas Bijnor", "Ram", 8979324668l, 222222222222l, "adqa5678adsa", 19981001, true);
	Person p3 = new Person("385 Avas Vikas Bijnor", "Sita", 8979324669l, 333333333333l, "adqa9101adsa", 19981001, false);	
	public RepositoryStorage() 
	{
		accounts.put("111111111111", p1);
		accounts.put("222222222222", p2);
		accounts.put("333333333333", p3);
	}
	@Override
	public HashMap<String, Person> getHashMap() 
	{
		return accounts;
	}
}
