package com.yash.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1To10 {

	public static int hcfOfTwoNumber(int num1,int num2)
	{
		
	  int l	=(num1<num2)?num1:num2;
	  int hcf=1;
	  for(int i=1;i<=l;i++)
	  {
		  if(num1%i==0&&num2%i==0)
			  hcf=i;
	  } 	
	  return hcf;
	}
	
	public static int findDigitLength(int num)
	{
		 
		 int l=0;
		  while(num>0)
		  {
			  num=num/10;
			  l++;
		  }	 
		  return l;
	}
	
	public static Boolean isArmstrong(int num)
	{
		
		int l=findDigitLength(num);
		int copy,digit;
		double sum=0;
	     copy=num; 
		while(copy!=0)
		{	
		 
		 digit=copy%10;
		 sum=sum+Math.pow(digit, l);
		 copy=copy/10;
		}
		System.out.println(sum);
		if(sum==num)
		 return true;
		else
		 return false;
	}
	
	public static Boolean checkPythagorasTemplate(int x,int y,int z)
	{
		x=x*x;
		y=y*y;
		z=z*z;
		if(x==y+z||y==x+z||z==x+y)
				return true;
		return false;
		
	}
	
	public static int countVowel(String str)
	{
		String str1=str.toUpperCase();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				count++;
		}	
		return count;
	}
	
	public static int reverse(int num)
	{
		int rev=0,temp;
		while(num!=0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10; 
		}
		return rev;
	}
	public static Boolean checkNoIsPalindrom(int num)
	{
	   int rev=reverse(num);
	   if(rev==num)
		return true;
	   return false;
	}
	
	public static boolean chaeckAllNoAreEven(int[] ary) {
		for(int i:ary)
		{
			if(i%2!=0)
			{
			  return false;	
			}	
		}	
		return true;
	}
	
	public static String removedAllDigitsWhiteSpaceSpecialChar(String str) {
	    String  sary[]=str.trim().split(" ");
	    String result="";
	    for(String i:sary)
	    {
	    	i=i.replaceAll("[^a-zA-Z]","");
	    	if(!(i==""))
	    	result=result+i+" ";
	    }	
		return result.trim();
	}
	
	public static String getUpdatedString(String[] fruits) {
		String str="";
		for(int i=0;i<fruits.length;i++)
		{
			if(i!=fruits.length-1)
			{	
			str=str+fruits[i]+"-";
			}
			else
			{
				str=str+fruits[i];
			}	
		}	
		return str;
	}
	
	public static boolean checkTwoStringArePalindrome(String input,String output)
	{
		char c;
	    String str="";
		for(int i=0;i<input.length();i++)
		{
		  c=input.charAt(i);
		  str=c+str;
			
		}	
		
		if(str.equalsIgnoreCase(str))
			
			return true;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
	
	//System.out.println(hcfOfTwoNumber(24,28));
		String result ="";
	 boolean flag=isArmstrong(153);
	  result =flag?"given number is armstrong number":" given number is not armstrong number";
     System.out.println(result);
     flag=checkPythagorasTemplate(3,4,5);
     result=flag?"given number satisfy pythagoras":" given number not satisfy pythagoras";
     System.out.println(result);
     int count =countVowel("Hello");
     System.out.println("Total vowel in Hello "+count);
     flag=checkNoIsPalindrom(121);
     result =flag?"given number is palindrom":" given number is not palindrom";
     System.out.println(result);
     int ary[]= {2,32,4,6,8};
     flag=chaeckAllNoAreEven(ary);
     result =flag?"All numbers are even":"All numbers are not even";
     System.out.println(result);
     
     String str=removedAllDigitsWhiteSpaceSpecialChar("This @ Red $car-"); 
     System.out.println(str);
     
     String fruits[] = {"apple","orange","banana","lemon"};
     String updatestr =getUpdatedString(fruits);
     System.out.println(updatestr);
     
     Person original =Person.getInstance();
     Person duplicate =Person.getInstance();
     
     System.out.println("original singleton object hashcode "+original.hashCode());
     System.out.println("original singleton object hashcode "+duplicate.hashCode());
     Student s=new Student("Ram","Indore");
   
   
     Student s1=null;
     
      try {
		s1=(Student)s.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("getting name from original object "+s.getName());
	System.out.println("getting name from clone object "+s1.getName());
	
	System.out.println(checkTwoStringArePalindrome("naman","naman"));
	
	}

	

	

	

}
