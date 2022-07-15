package com.yash.emi;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/emi/applicationContext.xml");
			EMI e1=(EMI)context.getBean("e");
			double rate=e1.getIrate();
			System.out.println(e1.emiCalculate(rate));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
