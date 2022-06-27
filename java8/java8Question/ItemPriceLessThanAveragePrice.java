package java8Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemPriceLessThanAveragePrice {

      public static void main(String[] args) {
    	  List <Integer> itemPrice = Arrays.asList(40, 32, 53, 22, 11, 89, 76);
    	  double avgprice=itemPrice.stream().mapToInt(t->t).summaryStatistics().getAverage();
    	  List <Integer> itemPriceLessThenAvgPrice= itemPrice.stream().filter(t->t<avgprice).collect(Collectors.toList());
    	  itemPriceLessThenAvgPrice.forEach(t->System.out.println(t));
    	  
    	  
	}	
	
	   
}
