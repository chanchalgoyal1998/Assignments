package helperclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Marks {

	public static List<Integer> getAllMarks()
	{
		List<Integer> markslist=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of subjects");
		int sub=sc.nextInt();
		System.out.println("enter the marks of "+sub+" subjects");
		int marks;
		for(int i=0;i<sub;i++)
		{
			marks=sc.nextInt();
			markslist.add(marks);
		}	
		return markslist;
	}
}
