package com.yash.students.entity;

import java.sql.Date;

public class Student {

	private int stdId;
	private String sname;
	private String fname;
	private String mname;
	private int cid;
	private String add;
	private String pincode;
	private String aadharno;
	private Date dob;
	private Date dateOfAdmission;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student(int stdId, String sname, String fname, String mname, int cid, String add, String pincode,
			String aadharno, Date dob, Date dateOfAdmission) {
		super();
		this.stdId = stdId;
		this.sname = sname;
		this.fname = fname;
		this.mname = mname;
		this.cid = cid;
		this.add = add;
		this.pincode = pincode;
		this.aadharno = aadharno;
		this.dob = dob;
		this.dateOfAdmission = dateOfAdmission;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


}