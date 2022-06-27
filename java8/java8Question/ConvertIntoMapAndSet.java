package java8Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import helperclass.Employees;

public class ConvertIntoMapAndSet {

	public static void main(String[] args) {
	List<Employees>list=new ArrayList<>();	
	list.add(new Employees(101,"Ram",30000));
	list.add(new Employees(102,"Mohan",40000));
	list.add(new Employees(103,"john",31000));
	list.add(new Employees(104,"Rita",45000));
	list.add(new Employees(105,"Geeta",35000));
	list.add(new Employees(106,"Seeta",37000));
	list.add(new Employees(106,"Reeta",37000));
	list.add(new Employees(107,"Meetu",50000));
	list.add(new Employees(108,"Neetu",36000));
	list.add(new Employees(109,"Sheena",48000));
	list.add(new Employees(110,"Meena",49000));
	list.add(new Employees(110,"Meena",49000));
   
	//convert list into map
	list.stream().collect(Collectors.toMap(Employees::getEmpid,Function.identity())).entrySet().
	forEach(t->System.out.println(t.getKey()+" = "+ t.getValue()));
	//convert list into set
	list.stream().collect(Collectors.toSet()).forEach(t->System.out.println(t));
	
	
	
}
	
}