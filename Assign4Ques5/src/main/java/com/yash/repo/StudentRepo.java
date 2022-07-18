package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.models.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
