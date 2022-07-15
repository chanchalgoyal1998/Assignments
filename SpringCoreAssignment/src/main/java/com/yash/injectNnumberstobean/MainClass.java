package com.yash.injectNnumberstobean;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
			IntegerClss integerClss = (IntegerClss)context.getBean(IntegerClss.class);
			List<Integer> numberList = integerClss.getNumbers();
			int maxNumber = numberList.stream().mapToInt(t->t).summaryStatistics().getMax();
			System.out.println("Max number is: " + maxNumber);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
