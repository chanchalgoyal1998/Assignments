package com.yash.controller;

import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ServiceImpl.OperationServiceImpl;
import com.yash.models.Student;
import com.yash.models.StudentTestAttempt;
import com.yash.models.Teacher;
import com.yash.models.Test;
import com.yash.models.TestQuestions;
import com.yash.services.OperationService;

@RestController
@RequestMapping("/v1")
public class MyController {
	@Autowired
	private OperationServiceImpl service;
	@GetMapping(path="/welcome")
	public String hello() {
		return "hello web page";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student s)
	{
		service.addStudent(s);
		return "saved";
	}
	
	@PostMapping("/addTest")
	public String addTest(@RequestBody Test s)
	{
		service.addTest(s);
		return "saved";
	}
	@PostMapping("/addTeacher")
	public String addTeacher(@RequestBody Teacher s)
	{
		service.addTeacher(s);
		return "saved";
	}
	
	@PostMapping("/StudentTestAttempt")
	public String studentTestAttempt(@RequestBody StudentTestAttempt s)
	{
		System.out.println(s);
		service.addStudentTestAttempt(s);
		return "saved";
	}
	
	@PostMapping("/addQues")
	public String addQues(@RequestBody TestQuestions s)
	{
		service.addQues(s);
		return "saved";
	     
	}
	
	@GetMapping("/getAllTestAttempt")
	public  List<StudentTestAttempt> getAllAttempt()
	{
	 	return service.getAllAttempt();
	}

	@GetMapping("/studentWithHighestMarks")
	public String studentWithHighestMarks()
	{
		
		Entry<Student, Integer> result= service.studentWithHighestMarks().get();
	 	return result.getKey().getSname()+" "+ result.getKey().getEmail()+" "+result.getValue();
	}
	
	@GetMapping("/studentWithLowestMarks")
	public String studentWithLowestMarks()
	{
		
		Entry<Student, Integer> result= service.studentWithLowestMarks().get();
	 	return result.getKey().getSname()+" "+ result.getKey().getEmail()+" "+result.getValue();
	}

	
	@GetMapping("/avgOfWrongQuestion")
	public double avgOfWrongQuestion()
	{
		
	   double avg=service.avgOfWrongQuestion();
	 	return avg;
	}
	
	
	/*@GetMapping("/totalMarksToeachStudent")
	public void totalMarksToeachStudent()
	{
		
	  service.totalMarksToeachStudent();
	 	
	}*/
	
	
	
	@GetMapping("/getTotalQuesDesignByTeacher")
	public  List<String> getAllTestquestions()
	{
	 	return service.getTotalQuesDesignByTeacher();
	}
	

	@GetMapping("/getTeacherNameAndTotalNumberOfTestCreated")
	public  List<String> getTeacherNameAndTotalNumberOfTestCreated()
	{
	 	return service.getTeacherNameAndTotalNumberOfTestCreated();
	}
	
	
	@GetMapping("/counttestGivenByStudent")
	public  List<String> counttestGivenByStudent()
	{
	 	return service.counttestGivenByStudent();
	}
	 
	@GetMapping("/CalAvgWrongQuesAttemptByStudents")
	public double CalAvgWrongQuesAttemptByStudents()
	{
		
		return service.CalAvgWrongQuesAttemptByStudents();
	}
	
	@GetMapping("/CalAvgCorrectQuesAttemptByStudents")
	public double CalAvgCorrectQuesAttemptByStudents()
	{
		
		return service.CalAvgCorrectQuesAttemptByStudents();
	}
	
}
