package com.yash.injectNnumberstobean;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages  = "com.yash.injectNnumberstobean")
public class ConfigurationClass {
	
	@Bean
	public IntegerClss integerClss()
	{
		IntegerClss nc=new IntegerClss();
		nc.setNumbers(Arrays.asList(12,76,45,98,0,-4,311));
		return nc;
	}

}
