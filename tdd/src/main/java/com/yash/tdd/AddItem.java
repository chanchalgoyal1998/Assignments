package com.yash.tdd;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class AddItem {

	public static String addItem(int itemid, String itemname, float cprice, float sprice, String manufacturing,
			String expiring) {
	
		//dummy method
		Item item=new Item();
		item.setItemid(itemid);
		item.setItemname(itemname);
		item.setCost_price(cprice);
		item.setSell_price(sprice);
		item.setManufacturingDate(manufacturing);
		item.setExpiringDate(expiring);
		return "item added successfully";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item id ");
		int itemid=sc.nextInt();
		System.out.println("Enter item name ");	
		String itemname=sc.next();
		System.out.println("Enter item cost price ");
		float cprice=sc.nextFloat();
		System.out.println("Enter item selling price ");
		float sprice=sc.nextFloat();
		System.out.println("Enter date of manufacturing in yyyy-mm-dd");
		String manufacturing=sc.next();
		System.out.println("Enter date of expiring in yyyy-mm-dd");
		String expiring=sc.next();
		
//		Item item=new Item();
//		item.setItemid(itemid);
//		item.setItemname(itemname);
//		item.setCost_price(cprice);
//		item.setSell_price(sprice);
//		item.setManufacturingDate(manufacturing);
//		item.setExpiringDate(expiring);
		String msg =addItem(itemid,itemname,cprice,sprice,manufacturing,expiring);
		System.out.println(msg);
//		System.out.println("item id "+item.getItemid());
//		System.out.println("item name "+item.getItemname());
//		System.out.println("item cost price "+item.getCost_price());
//		System.out.println("item selling price "+item.getSell_price());
//		System.out.println("date of manufacturing in yyyy-mm-dd "+item.getManufacturingDate());
//		System.out.println("date of expiring in yyyy-mm-dd "+item.getExpiringDate());
	}

	

	

}
