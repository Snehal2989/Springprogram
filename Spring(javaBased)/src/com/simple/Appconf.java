package com.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconf {
	
	@Bean
	public Employee get()
	{
		
		Employee e= new Employee();
		return  e;
		
		// return new Employee();
	}

}
