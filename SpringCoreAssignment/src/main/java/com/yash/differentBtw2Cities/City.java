package com.yash.differentBtw2Cities;

public class City {

	private String city1;
	private String city2;
	private double distance;
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public City(String city1, String city2, double distance) {
		super();
		this.city1 = city1;
		this.city2 = city2;
		this.distance = distance;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
