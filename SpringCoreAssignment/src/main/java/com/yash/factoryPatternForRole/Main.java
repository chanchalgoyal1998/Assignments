package com.yash.factoryPatternForRole;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	

	 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/yash/factoryPatternForRole/applicationContext.xml");
//   BeanFactory factory=new XmlBeanFactory(resource);
	 System.out.println("************************for user*****************");
	 Role role=(Role)context.getBean("role");// when role is USER ,this beanid is from applicationcontext.xml what we declare in xml we called here
     role.printDetails();
     System.out.println("************************for admin*****************");
     Role role1=(Role)context.getBean("role1");// when role is ADMIN,this beanid is from applicationcontext.xml what we declare in xml we called here
     role1.printDetails();
		
}

}
