package com.yash.merge2array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		try {
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/yash/merge2array/applicationContext.xml");
			Array1 array1 = (Array1) context.getBean("ary1");
			Array2 array2 = (Array2) context.getBean("ary2");

			int totallength = array1.getArray1().length + array2.getArray2().length;
			Integer[] newArray = new Integer[totallength];

			int i = 0;
		
			for (int a : array1.getArray1()) {
				newArray[i] = a;
				i++;
			}
		
			for (int a : array2.getArray2()) {
				newArray[i] = a;
				i++;
			}

			List<Integer> list = Arrays.asList(newArray);
			int max= list.stream().mapToInt(t->t).summaryStatistics().getMax();
			System.out.println(max);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
