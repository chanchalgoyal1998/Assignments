package com.yash.movies;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/movies/ApplicationContext.xml");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time sloat start time-end time time reference");
        String  sloat=sc.next().trim();
        Movies movies =(Movies) context.getBean("movielist");
        List<Movie> list=movies.getMovies();
        //System.out.println(list);
         boolean flag =false;
        for(Movie m:list)
        {
           if(m.getMovietime().equalsIgnoreCase(sloat))
           {
        	   m.show();
        	   flag=true;
           }	   
        } 	
        if(flag =false)
        {
        	System.out.println("No movies found in given time "+sloat);
        }
    }
}
