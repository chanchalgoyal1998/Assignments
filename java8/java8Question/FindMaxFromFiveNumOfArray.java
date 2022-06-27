package java8Question;

import java.util.Arrays;
import java.util.List;

public class FindMaxFromFiveNumOfArray {
      public static void main(String[] args) {
    	  Integer ary[]= {2,67,1,0,5};
  	    List<Integer>list =Arrays.asList(ary);
  	    int max=list.stream().mapToInt(t->t).summaryStatistics().getMax();
  	    System.out.println(max);
	}

}
