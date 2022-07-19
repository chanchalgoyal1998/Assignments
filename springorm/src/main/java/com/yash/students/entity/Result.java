package com.yash.students.entity;

import java.sql.Date;

public class Result {

	private int rid;
	private double maths;
	private double hindi;
	private double english;
	private double science;
	private double sanskrit;
	private int sid;
	private Date dateTime;

	public Result() {

	}


	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getHindi() {
		return hindi;
	}

	public void setHindi(double hindi) {
		this.hindi = hindi;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
	}

	public double getSanskrit() {
		return sanskrit;
	}

	public void setSanskrit(double sanskrit) {
		this.sanskrit = sanskrit;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public Result(int rid, double maths, double hindi, double english, double science, double sanskrit, int sid,
			Date dateTime) {
		super();
		this.rid = rid;
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.sanskrit = sanskrit;
		this.sid = sid;
		this.dateTime = dateTime;
	}


	@Override
	public String toString() {
		return "Result [rid=" + rid + ", maths=" + maths + ", hindi=" + hindi + ", english=" + english + ", science="
				+ science + ", sanskrit=" + sanskrit + ", sid=" + sid + ", dateTime=" + dateTime + "]";
	}

	

}
