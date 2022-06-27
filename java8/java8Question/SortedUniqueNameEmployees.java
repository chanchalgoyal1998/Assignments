package java8Question;

import java.util.List;
import java.util.stream.Collectors;

import helperclass.Employee;

public class SortedUniqueNameEmployees {

	public static void main(String[] args) {
	 List<String>employeeNameList=Employee.getAllEmployeeName();
	 //way-1
	 employeeNameList.stream().sorted().distinct().forEach(t->System.out.println(t));
	 //way-2
	// employeeNameList.stream().sorted().collect(Collectors.toSet()).forEach(t->System.out.println(t));
	}
}
