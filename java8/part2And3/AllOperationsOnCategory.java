package part2And3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AllOperationsOnCategory {

	public static void main(String[] args) {
		Category c1= new Category(101,"grocery");
		Category c2= new Category(102,"dairy product");
	
		List<Item>itemlist= new ArrayList<>();
		itemlist.add(new Item(1,"rice",100, LocalDate.of(2020,05,28),LocalDate.of(2021,05,28),"best quality rice",c1));
		itemlist.add(new Item(2,"Flour",200, LocalDate.of(2021,05,28),LocalDate.of(2022,05,28),"best quality Flour",c1));
		itemlist.add(new Item(3,"butter",500, LocalDate.of(2022,05,28),LocalDate.of(2022,06,28),"best quality butter",c2));
		itemlist.add(new Item(4,"cheese",500, LocalDate.of(2022,03,28),LocalDate.of(2022,04,28),"best quality cheese",c2));
	 //   System.out.println(itemlist);
	    
	    findByCategory(itemlist);
	    searchItemByStartingLetter(itemlist);
	    priceInRange(itemlist);
		findItemsByDateOfManufacturingORDateOfExpiring(itemlist);
	}

	private static void findItemsByDateOfManufacturingORDateOfExpiring(List<Item>itemlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter expiry date in yyyy-MM-dd");
		String expirydate=sc.next();
		LocalDate expirydate1 =LocalDate.parse(expirydate);
		System.out.println("enter Manufacturing date in yyyy-MM-dd");
		String manufacturing=sc.next();
		LocalDate manufacturing1 =LocalDate.parse(manufacturing);
		List<Item>items=itemlist.stream().
		filter(t->expirydate1.isEqual(t.getDateOfExpiring())||manufacturing1.isEqual(t.getDateOfManufacturing())).collect(Collectors.toList());
		System.out.println("all items ");
		items.forEach(t->System.out.println(t));
	}

	private static void priceInRange(List<Item>itemlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter minimum price");
		int min=sc.nextInt();
		System.out.println("enter maximum price");
		int max=sc.nextInt();
		List<Item>items=itemlist.stream().filter(t->t.getPrice()>=min&&t.getPrice()<=max).collect(Collectors.toList());
		System.out.println("items in price range "+min+" to"+max);
		items.forEach(t->System.out.println(t));
	}

	private static void searchItemByStartingLetter(List<Item>itemlist) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter starting letter of category");
    	String cat=sc.next();
    	List<Item>items=itemlist.stream().filter(t->t.getName().startsWith(cat)).collect(Collectors.toList());
		System.out.println("list of items start with "+cat);
		items.forEach(t->System.out.println(t));
	}

	private static void findByCategory(List<Item>itemlist) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter category name");
    	String cat=sc.next();
    	itemlist.stream().filter(t->t.getCategory().getCatname().equalsIgnoreCase(cat)).
    	forEach(t->System.out.println(t));
    	
	}
}
