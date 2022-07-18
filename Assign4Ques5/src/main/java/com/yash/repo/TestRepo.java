package com.yash.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yash.models.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer>{

 @Query("select t.teacher.techerid,count(t.teacher.techerid) ,t.teacher.teachername"
 		+ " from Test as t group by  t.teacher.techerid")	
  List<Object[]> getTeacherNameAndTotalNumberOfTestCreated();
}
