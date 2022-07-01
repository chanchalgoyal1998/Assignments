package com.yash.tdd;

public class Calculator {

	public static double cubeRoot(int i) {
		if(i<0)
		{
			throw new IllegalArgumentException("negative number for cube not allowed");
		}
		else
		{
			return Math.cbrt(i);
		}	
	
	}

	public static double squareRoot(int i) {
		if(i<0)
		{
			throw new IllegalArgumentException("negative number for square root not allowed");
		}
		else
		{
			return Math.sqrt(i);
		}	
	}

	public static double power(int i, int j) {
		
		if(j<0)
		{
			throw new IllegalArgumentException("negative power not allowed");
		}
		else
		{
			return Math.pow(i, j);
		}	
	}

	public static int modulus(int i, int j) {
		if(j==0)
		{
			throw new ArithmeticException("can't divide by zero");
		}
	   return i%j;
		
	}

	public static int div(int i, int j) {
		if(j==0)
		{
			throw new ArithmeticException("can't divide by zero");
		}	
		 
		return i/j;
	}

	public static int mul(int i, int j) {
		 return i*j;
		
	}

	public static int sub(int i, int j) {
	
		 return i-j;
	}

	public static int add(int i, int j) {
	 return i+j;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(add(2,-3));
        System.out.println(sub(-5,-7));
        System.out.println(mul(0,3));
        System.out.println(div(10,2));
        System.out.println(modulus(8,3));
        try {
        System.out.println(power(2,-3));
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        
        
        try {
        System.out.println(squareRoot(-16)); 
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        
        
        
        try {
        System.out.println(cubeRoot(-27));
     	}
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
       
	}

	

}
