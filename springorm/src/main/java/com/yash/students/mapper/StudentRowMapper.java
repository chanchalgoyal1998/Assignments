package com.yash.students.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.students.entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStdId(rs.getInt("sid"));
		student.setSname(rs.getString("sname"));
		student.setFname(rs.getString("father_name"));
		student.setMname(rs.getString("mother_name"));
		student.setCid(rs.getInt("classid"));
		student.setAdd(rs.getString("add1"));
		student.setPincode(rs.getString("pincode"));
		student.setAadharno(rs.getString("aadharno"));
		student.setDob(rs.getDate("dob"));
		student.setDateOfAdmission(rs.getDate("dateofadmission"));
		return student;
	}

}
