package com.yash.differentBtw2Cities;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/differentBtw2Cities/applicationContext.xml");
	    CityList citylist=(CityList)context.getBean("cl");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first city");
	    String firstcity=sc.next();
	    System.out.println("Enter second city");
	    String secondcity=sc.next();
	    boolean flag=false;
	    List<City> list=citylist.getCitylist();
	    for(City c:list)
	    {
	    	if((c.getCity1().equalsIgnoreCase(firstcity)&&c.getCity2().equalsIgnoreCase(secondcity))||(c.getCity1().equalsIgnoreCase(secondcity)&&c.getCity2().equalsIgnoreCase(firstcity)))
	    	{
	    		System.out.println("distance between "+c.getCity1()+" and "+c.getCity2()+" is "+c.getDistance());
	    		flag=true;
	    	}
	    }	
	    if(flag==false)
	    	System.out.println("city not found");
	}

}
