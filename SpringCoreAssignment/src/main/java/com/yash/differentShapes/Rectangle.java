package com.yash.differentShapes;

import java.util.Scanner;

public class Rectangle implements Shape {

	@Override
	public double areaOfShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle: ");
		double l=sc.nextDouble();
		System.out.println("Enter Width of Rectangle: ");
		double w=sc.nextDouble();
		return l*w;
	}

	@Override
	public double sidesOfShape() {
		return 4;
	}

}
