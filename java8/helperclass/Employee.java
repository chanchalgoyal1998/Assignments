package helperclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public static List<String> getAllEmployeeName()
	{
		List<String> emplist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of employees");
		int employees=sc.nextInt();
		System.out.println("enter the name of "+employees+" employees");
		String name;
		for(int i=0;i<employees;i++)
		{
			name=sc.next();
			emplist.add(name);
		}	
		return emplist;
	}
}
