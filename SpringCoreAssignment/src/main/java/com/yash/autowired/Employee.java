package com.yash.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int eid;
	private String ename;
	private double esalary;
	
	@Autowired
	@Qualifier("python")
	private Department empDepartment;

	public int getEid() {
		return eid;
	}

	public void setEid(int empId) {
		this.eid = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String empName) {
		this.ename = empName;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public Department getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(Department empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + eid + ", empName=" + ename + ", empSalary=" + esalary + ", empDepartment="
				+ empDepartment + "]";
	}
	
}
