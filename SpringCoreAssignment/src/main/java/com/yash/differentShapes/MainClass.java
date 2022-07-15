package com.yash.differentShapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yash/differentShapes/applicationContext.xml");
		Shape shape1=(Shape)context.getBean("circle");
	   System.out.println("area of circle "+shape1.areaOfShape());	
	   System.out.println("side of circle "+shape1.sidesOfShape());
	   
	   Shape shape2=(Shape)context.getBean("rec");
	   System.out.println("area of Rectangle "+shape2.areaOfShape());	
	   System.out.println("side of Rectangle "+shape2.sidesOfShape());
	   
	   Shape shape3=(Shape)context.getBean("sq");
	   System.out.println("area of square "+shape3.areaOfShape());	
	   System.out.println("side of square "+shape3.sidesOfShape());
		
		
		
	}

}
