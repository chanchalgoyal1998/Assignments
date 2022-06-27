package java8Question;

import java.util.function.Predicate;

public class PredicateToCheckNoIsEven {

	public static void main(String[] args) {
	 
	 Predicate<Integer> checkEven=num->num%2==0;
	
	  if(checkEven.test(4))
	  {
		  System.out.println("Even no");
	  }		  
	}
	
	
	
}
