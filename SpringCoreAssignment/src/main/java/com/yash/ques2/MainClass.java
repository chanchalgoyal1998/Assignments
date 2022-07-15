package com.yash.ques2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	
	public static void main(String[] args) {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/ques2/applicationContext.xml");
			Average average=(Average)context.getBean("avg");
			System.out.println(average.averageOfNumber());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
