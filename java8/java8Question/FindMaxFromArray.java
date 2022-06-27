package java8Question;

import java.util.Arrays;
import java.util.List;

public class FindMaxFromArray {
     public static void main(String[] args) {
		Integer ary[]= {2,67,1,0,5,6,122,7,3};
	    List<Integer>list =Arrays.asList(ary);
	    int max=list.stream().mapToInt(t->t).summaryStatistics().getMax();
	    System.out.println(max);
	}

}
