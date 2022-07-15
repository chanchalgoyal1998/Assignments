package com.yash.injectnamestobean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.injectnamestobean")
public class ConfigurationClass {
	
	@Bean
	public NameClass nameClass()
	{
		NameClass nc=new NameClass();
		System.out.println("Bean class");
		nc.setName1("abc");
		nc.setName2("xyz");
		nc.setName3("pqr");
		nc.setName4("ram");
		nc.setName5("shyam");
		return nc;
	}

}
