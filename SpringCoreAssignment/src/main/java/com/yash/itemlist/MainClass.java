package com.yash.itemlist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		try {
			ApplicationContext Context = new ClassPathXmlApplicationContext(
					"com/yash/itemlist/applicationContext.xml");
			Items items=(Items)Context.getBean("items");
			System.out.println(items.getItems());
			System.out.println();
			System.out.println("..............................................assending order......................");
			List<Item> ascendingOrderList=items.getItems().stream().sorted((e1,e2)->e1.getItemName().compareTo(e2.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(ascendingOrderList);
			System.out.println();
			System.out.println("..........................................desending order............................");
			List<Item> descendingOrderList=items.getItems().stream().sorted((e1,e2)->e2.getItemName().compareTo(e1.getItemName())).distinct().collect(Collectors.toList());
			System.out.println(descendingOrderList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
