package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.models.TestQuestions;
@Repository
public interface TestQuestionRepo extends JpaRepository<TestQuestions, Integer> {

	
	
@Query("select  tq.test.testid,count(tq.test.teacher.techerid),tq.test.teacher.techerid,tq.test.teacher.teachername"
		+ "  from TestQuestions as tq group by tq.test.testid,tq.test.teacher.techerid") 
	List<Object[]> total_question_design_by_teacher();

}
