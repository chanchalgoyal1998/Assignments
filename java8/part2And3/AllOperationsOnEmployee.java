package part2And3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AllOperationsOnEmployee {
	
    private static void employeeInPerticularDept(List<Employee> list)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter emp name");
    	String name=sc.next();
    	System.out.println("Enter emp department name");
    	String dept=sc.next();
       Optional<Employee> emp=list.stream().
    	filter(t->t.getName().equalsIgnoreCase(name)&&t.getDept().equalsIgnoreCase(dept)).findFirst();
     if(emp.isPresent())
     {
    	 System.out.println("employee exist with following details "+emp.get() );
     } 	 
     else
     {
    	 System.out.println("employee not found " );
     }	 
    }
	
    private static void averageSalaryOfEachDept(List<Employee> list) {
    	
    	System.out.println("average Salary Of Each Dept");
     Map<String,Double> info=
     list.stream().
		collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
	info.entrySet().forEach(t->System.out.println(t.getKey()+"---->"+t.getValue()));
     
	}
    
    private static void findHighestAndLowestSalaryOfEachDept(List<Employee> list) {
	Map<String, Optional<Employee>> maxSalDeptWise
    	=list.stream().
	collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
    	
	
    maxSalDeptWise.entrySet().forEach(t->System.out.println("Department Name "+t.getKey()+", Highest salary "+t.getValue().get().getSalary()));
	
    System.out.println("*****************************************************");
	Map<String,Optional<Employee>>minSalDeptWise=
	list.stream().
	collect(Collectors.groupingBy(Employee::getDept,Collectors.minBy(Comparator.comparingInt(Employee::getSalary))));
    	
	minSalDeptWise.entrySet().forEach(t->System.out.println("Department Name "+t.getKey()+" ,Lowest salary "+t.getValue().get().getSalary()));
		
	}
    
    
    
    
    private static void departmentWithHighestAndLowestNoOfEmployee(List<Employee> list) {
	
    Map<String,Long> noOfEmpInEachDept=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));	
	noOfEmpInEachDept.entrySet().forEach(t->System.out.println(t.getKey()+"----->"+t.getValue()));
	LinkedHashMap<String,Long> sortedMap = new LinkedHashMap<>();
	
	 noOfEmpInEachDept.entrySet().stream()
	.sorted(Map.Entry.comparingByValue()).forEachOrdered(t->sortedMap.put(t.getKey(), t.getValue()));
  
	 System.out.println(sortedMap);
   System.out.println("department with lowest no of employees "+ sortedMap.entrySet().stream().findFirst().get());
    System.out.println("department with highest no of employees "+ sortedMap.entrySet().stream().skip(sortedMap.size()-1).findFirst().get());
   
    
    
    }
    


    
     private static void upcomingBirthday(List<Employee> list) {
    	LocalDate date=LocalDate.now();
 	
    	LocalDate lastdate  = date.with(TemporalAdjusters.lastDayOfMonth());
    	List<Employee> list1=list.stream().filter(t->t.getDob().isBefore(lastdate)&&t.getDob().isEqual(date)&&t.getDob().isEqual(lastdate)).collect(Collectors.toList());
	    list1.stream().forEach(t->System.out.println(t));
     }
    
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Ram", LocalDate.of(1996,05,28), LocalDate.of(2018,05,28) ,LocalDate.of(2020,05,28),"Indore" ,"dev",40000));
		list.add(new Employee("Mohan", LocalDate.of(1997,06,21), LocalDate.of(2019,05,28) ,LocalDate.of(2021,05,28),"Pune" ,"testing",30000));	
		list.add(new Employee("Seeta", LocalDate.of(1998,07,23), LocalDate.of(2020,05,28) ,LocalDate.of(2021,05,28),"Indore" ,"salseforce",35000));
		list.add(new Employee("Geeta", LocalDate.of(1999,06,24), LocalDate.of(2021,05,28) ,LocalDate.of(2021,05,28),"Bhopal" ,"UI",30000));
		list.add(new Employee("Neeta", LocalDate.of(1993,06,28), LocalDate.of(2017,05,28) ,LocalDate.of(2019,05,28),"Indore" ,"dev",45000));
		list.add(new Employee("Reeta", LocalDate.of(1994,05,20), LocalDate.of(2016,05,28) ,LocalDate.of(2018,05,28),"Pune" ,"dev",40000));
		list.add(new Employee("Sheena", LocalDate.of(1995,04,21), LocalDate.of(2015,01,28) ,LocalDate.of(2018,05,28),"Delhi" ,"UI",36000));
		list.add(new Employee("Meena", LocalDate.of(1991,04,22), LocalDate.of(2014,02,28) ,LocalDate.of(2018,05,28),"Indore" ,"UI",30000));
		list.add(new Employee("Heena", LocalDate.of(1992,05,27), LocalDate.of(2021,03,28) ,LocalDate.of(2022,05,28),"Pune" ,"testing",40000));
		list.add(new Employee("Meeta", LocalDate.of(2000,02,9), LocalDate.of(2020,04,28) ,LocalDate.of(2021,05,28),"Indore" ,"dev",70000));
	    list.stream().forEach(t->System.out.println(t));
	    employeeInPerticularDept(list);
	    averageSalaryOfEachDept(list);
	     findHighestAndLowestSalaryOfEachDept(list);
	      departmentWithHighestAndLowestNoOfEmployee(list);
	   
	    upcomingBirthday(list);
	    upcomingJobAnniversary(list);
	}

	private static void upcomingJobAnniversary(List<Employee> list) {
		LocalDate date=LocalDate.now();
	 	
    	LocalDate lastdate  = date.with(TemporalAdjusters.lastDayOfMonth());
    	List<Employee> list1=list.stream().filter(t->t.getDoj().isBefore(lastdate)&&t.getDoj().isEqual(date)&&t.getDoj().isEqual(lastdate)).collect(Collectors.toList());
	    list1.stream().forEach(t->System.out.println(t));
		
	}

	


	

	

	
}
