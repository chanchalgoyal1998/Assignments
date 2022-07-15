package com.yash.differentShapes;
import java.util.Scanner;

public class Circle implements  Shape {

	@Override
	public double areaOfShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius ");
		double r=sc.nextDouble();
		return Math.PI*r*r;
	}

	@Override
	public double sidesOfShape() {
		// TODO Auto-generated method stub
		return 0;
	}
	 


}
