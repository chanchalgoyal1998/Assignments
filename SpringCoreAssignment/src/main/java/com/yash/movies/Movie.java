package com.yash.movies;


public class Movie {

	private String moviename;
	private String movietime;
	private int ticketprice;
	private int moneyearn;
	
		
	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getMovietime() {
		return movietime;
	}


	public void setMovietime(String movietime) {
		this.movietime = movietime;
	}


	public int getTicketprice() {
		return ticketprice;
	}


	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}


	public int getMoneyearn() {
		return moneyearn;
	}


	public void setMoneyearn(int moneyearn) {
		this.moneyearn = moneyearn;
	}


	public void show() {
		
		System.out.println("Movie Name: "+moviename);
		System.out.println("Movie Time: "+movietime);
		System.out.println("Movie Ticket Price: "+ticketprice);
		System.out.println("Movie Money earned: "+moneyearn+" Cr.");
		System.out.println();
	}
}
