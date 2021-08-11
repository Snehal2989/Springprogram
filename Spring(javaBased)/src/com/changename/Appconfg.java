package com.changename;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {

	
	@Bean(name= "s11")
	public Student s()
	{
		System.out.println("Hello");
		return new Student();
	}
	
}
