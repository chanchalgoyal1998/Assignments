package com.yash.movies;

import java.util.List;

public class Movies {
List<Movie> movies;

@Override
public String toString() {
	return "Movies [movies=" + movies + "]";
}

public List<Movie> getMovies() {
	return movies;
}

public void setMovies(List<Movie> movies) {
	this.movies = movies;
}

public Movies() {
	super();
	// TODO Auto-generated constructor stub
}

public Movies(List<Movie> movies) {
	super();
	this.movies = movies;
}




}
