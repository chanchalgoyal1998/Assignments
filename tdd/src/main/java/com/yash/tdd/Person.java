package com.yash.tdd;

public class Person {

    private static Person person=null;
	private Person()
	{
		
	}
	
	public static Person getInstance()
	{
		
		if(person==null)
		  person=new Person();
		
		return person;
	}

	
	
	
}
