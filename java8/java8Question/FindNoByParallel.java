package java8Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindNoByParallel {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,6,7);
		Optional<Integer> num=list.stream().parallel().filter(t->t==3).findAny();
		if(num.isPresent())
		{
			System.out.println("num is present");
		}	
		else
		{
			System.out.println("num is not present");
		}		
	}
}
