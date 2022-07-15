package com.yash.factoryPatternForRole;

public class RoleFactory {

	public static Role createRole( String role, String name,String password)
	{
		if(role.equalsIgnoreCase("admin"))
		{
			return new Admin(role,name,password);
		}	
		else 
		{
			return new User(role,name,password);
		}	
		
		
	}
}
