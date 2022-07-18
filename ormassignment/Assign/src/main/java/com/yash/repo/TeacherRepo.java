package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.models.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer>{

}
