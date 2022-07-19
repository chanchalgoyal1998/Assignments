package com.yash.students.entity;

public class Classs {

	private int cid;
	private String cname;
	private String section;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Classs(int cid, String cname, String section) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.section = section;
	}
	public Classs() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}