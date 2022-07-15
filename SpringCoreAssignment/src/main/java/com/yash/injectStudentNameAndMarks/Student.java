package com.yash.injectStudentNameAndMarks;



import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Student {

	HashMap<String, Integer> students;

	public HashMap<String, Integer> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Integer> students) {
		this.students = students;
	}

		
	public void display() {
		
		List<Entry<String, Integer>> newlist = new LinkedList<Map.Entry<String,Integer>>(students.entrySet());
		
		Collections.sort(newlist, (a,b)->a.getValue().compareTo(b.getValue()));
		
		HashMap<String, Integer> result = new LinkedHashMap();
		
		for(Map.Entry<String, Integer> entry:newlist) {
			result.put(entry.getKey(), entry.getValue());
		}
		
		for(Map.Entry entry:result.entrySet()) {
			System.out.println("Name: "+entry.getKey()+"--->  Marks: "+entry.getValue());
			
		}
	}
}
