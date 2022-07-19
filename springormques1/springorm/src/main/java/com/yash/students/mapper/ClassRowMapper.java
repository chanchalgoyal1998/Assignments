package com.yash.students.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.students.entity.Classs;

public class ClassRowMapper implements RowMapper<Classs>{

	public Classs mapRow(ResultSet rs, int rowNum) throws SQLException {
		Classs classs=new Classs();
		classs.setCid(rs.getInt("classid"));
		classs.setCname(rs.getString("classname"));
		classs.setSection(rs.getString("sectionname"));
		return classs;
	}

}
