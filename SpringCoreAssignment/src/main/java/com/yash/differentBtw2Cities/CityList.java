package com.yash.differentBtw2Cities;

import java.util.List;

public class CityList {

	private List<City> citylist;

	public List<City> getCitylist() {
		return citylist;
	}

	public void setCitylist(List<City> citylist) {
		this.citylist = citylist;
	}

	public CityList(List<City> citylist) {
		super();
		this.citylist = citylist;
	}

	@Override
	public String toString() {
		return "CityList [citylist=" + citylist + "]";
	}

	public CityList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
