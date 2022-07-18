package com.yash.employees;

import java.util.List;

public class Employees {
private List<Employee> emplist;

public List<Employee> getEmplist() {
	return emplist;
}

public void setEmplist(List<Employee> emplist) {
	this.emplist = emplist;
}

public Employees(List<Employee> emplist) {
	super();
	this.emplist = emplist;
}

public Employees() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employees [emplist=" + emplist + "]";
}



}
