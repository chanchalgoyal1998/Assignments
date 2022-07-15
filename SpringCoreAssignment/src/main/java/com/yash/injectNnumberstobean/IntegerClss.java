package com.yash.injectNnumberstobean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IntegerClss{
	public IntegerClss()
	{
		System.out.println("inside Integer class cons");
	}
	
	private List<Integer> numbers=new ArrayList<>();

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	} 
	
	
}
