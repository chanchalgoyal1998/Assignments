package com.yash.autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/yash/autowired/applicationContext.xml");

			Employee employee1 = (Employee) context.getBean("emp");
			employee1.setEid(101);
			employee1.setEname("ABc");
			employee1.setEsalary(23000);
			empList.add(employee1);
			
			Employee employee2= (Employee) context.getBean("emp");
			employee2.setEid(102);
			employee2.setEname("xyz");
			employee2.setEsalary(45000);
			empList.add(employee2);
			
			
			Employee employee3 = (Employee) context.getBean("emp");
			employee3.setEid(103);
			employee3.setEname("pqr");
			employee3.setEsalary(26000);
			empList.add(employee3);
		
			List<Employee> empSortedList=empList.stream().sorted(Comparator.comparing(Employee::getEsalary)).collect(Collectors.toList());
			System.out.println(empSortedList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
