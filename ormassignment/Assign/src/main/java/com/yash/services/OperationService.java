package com.yash.services;

import org.springframework.stereotype.Service;

import com.yash.models.Student;
import com.yash.models.TestQuestions;
@Service
public interface OperationService {

	public void addStudent(Student s);
	public void addQues(TestQuestions s);
}
