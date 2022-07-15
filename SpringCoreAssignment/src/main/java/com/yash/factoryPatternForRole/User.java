package com.yash.factoryPatternForRole;

public class User implements Role {


	private String role;
	private String name;
	private String password;
	public User(String role, String name, String password) {
		this.name=name;
		this.role=role;
		this.password=password;
		
	}
	
	
	
	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [role=" + role + ", name=" + name + ", password=" + password + "]";
	}



	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println("user created");
		 System.out.println("role :"+role );
		    System.out.println("name :"+name );
		    System.out.println("password :"+password );
	}

}
