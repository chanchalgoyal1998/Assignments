package java8Question;

import java.util.List;
import java.util.stream.Collectors;

import helperclass.Marks;
/*set*/
public class FindDistinctMarks {

	 public static void main(String[] args)
	 {
		 // WAP to print distinct marks from the list of given marks .
		
	   List<Integer>markslist =Marks.getAllMarks();
	   markslist.stream().collect(Collectors.toSet()).forEach(t->System.out.println(t));
		
	   
     }
}
