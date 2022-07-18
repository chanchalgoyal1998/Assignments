package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.models.StudentTestAttempt;

@Repository

public interface StudentTestAttemptRepo extends JpaRepository<StudentTestAttempt,Integer>{

 @Query("select  sa.student.sid,sa.student.sname,count(distinct(sa.question.test.testid)) from StudentTestAttempt as sa group by sa.student.sid ,sa.question.test.testid")
   List<Object[]> counttestGivenByStudent();  
      //select studentid, count(studentid ) total_ques from  student_test_attempt group by studentid;
}
