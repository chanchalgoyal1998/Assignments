package java8Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenItemPrice {
    
	  public static void main(String[] args) {
    	  List <Integer> itemPrice = Arrays.asList(40, 32, 53, 22, 11, 89, 76);
    	  
    	  List <Integer> evenItemPrice= itemPrice.stream().filter(t->t%2==0).collect(Collectors.toList());
    	  evenItemPrice.forEach(t->System.out.println(t));
    	  
    	  
	}	
}
