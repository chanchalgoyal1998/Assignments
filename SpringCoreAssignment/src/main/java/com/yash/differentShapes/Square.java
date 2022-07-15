package com.yash.differentShapes;

import java.util.Scanner;

public class Square implements Shape {

	@Override
	public double areaOfShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square : ");
		double a=sc.nextDouble();
		return a*a;
	}

	@Override
	public double sidesOfShape() {
		return 4;
	}

}
