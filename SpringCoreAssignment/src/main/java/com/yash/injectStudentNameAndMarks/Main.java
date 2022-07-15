package com.yash.injectStudentNameAndMarks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/injectStudentNameAndMarks/ApplicationContext.xml");
	Student s = (Student) context.getBean("stud");
	s.display();
}
}
