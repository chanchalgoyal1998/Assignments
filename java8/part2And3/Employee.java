package part2And3;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
 private String name;
 private LocalDate dob;
 private LocalDate doj;
 private LocalDate dor;
 private String location;
 private String dept;
 private int salary;
@Override
public String toString() {
	return "Employee [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor + ", location=" + location
			+ ", dept=" + dept + ", salary=" + salary + "]";
}
public Employee(String name, LocalDate dob, LocalDate doj, LocalDate dor, String location, String dept, int salary) {
	super();
	this.name = name;
	this.dob = dob;
	this.doj = doj;
	this.dor = dor;
	this.location = location;
	this.dept = dept;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public LocalDate getDor() {
	return dor;
}
public void setDor(LocalDate dor) {
	this.dor = dor;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 
 
 
 
 
}
