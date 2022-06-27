package java8Question;
import java.util.Arrays;
import java.util.List;

import helperclass.Marks;
/*input box*/
public class FindAverageOfMarks {

	/* WAP to find out average marks from the list of the marks, user will enter the marks through 
	the input box and you need to fetch them and calculate the marks.*/
	
	public static void main(String[] args) {
		List<Integer> markslist=Marks.getAllMarks();
		double avg=markslist.stream().mapToInt(t->t).summaryStatistics().getAverage();
		System.out.println("average of marks "+avg);
		
	}
	
}
