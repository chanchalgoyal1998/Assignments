package helperclass;

import java.util.Objects;

public class Employees {
private int empid;
private String ename;
private int sal;



public Employees(int empid, String ename, int sal) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.sal = sal;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}



@Override
public int hashCode() {
	return getEmpid();
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employees e = (Employees) obj;
	return (this.getEmpid()==e.getEmpid());
}

@Override
public String toString() {
	return "Employees [empid=" + empid + ", ename=" + ename + ", sal=" + sal + "]";
}


	
}
