package com.yash.employees;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/employees/applicationContext.xml");
        Employees employees=  (Employees) context.getBean("elist");
        List<Employee>list=employees.getEmplist();
       
       // Optional<Employee> maxSalaryEmp=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(null)));
      
         
         Optional<Employee> maxSalaryEmp=list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
         System.out.println("name of employees having highest salary "+maxSalaryEmp.get().getName());
         System.out.println("================");
    	
    	System.out.println(" Maximum salary of Department: ");
    	Map<String, Optional<Employee>> maxSalaryEmpdeptwise =list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		for(Map.Entry<String,Optional<Employee>> m:maxSalaryEmpdeptwise.entrySet())
		{
			System.out.println("Department name "+m.getKey()+"----->"+"max Salary"+m.getValue().get().getSalary());
		}
    
		System.out.println("================");
		
		Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
		List<Employee> min = list.stream().filter(a -> a.getSalary() < avg).toList();
		
		System.out.println("Name of employee having salary less than or equal to average salary");
		for(Employee e : min) {
			System.out.println(e.getName()+" : "+e.getSalary());
		}

		System.out.println("================");
		
		System.out.println("Average Salary of each Department: ");
		Map<String, Double> avgsal = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgsal);
    }
}
