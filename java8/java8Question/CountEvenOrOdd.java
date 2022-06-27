package java8Question;

import java.util.Arrays;
import java.util.List;

public class CountEvenOrOdd {

	
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,3,4,5,8,9,10,34,15);
		long even=list.stream().filter(t->t%2==0).count();
		System.out.println("Total even number "+even+" and total odd number "+(list.size()-even));
	}
}
