package com.variable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
	
	@Bean(name="stud")
	public Student st()
	{
		System.out.println("Creating obj of student");
		Student s= new Student();
		System.out.println("Setting value of student");
		s.setId(101);
		s.setName("roshan");
		s.setAdd("Pune");
		System.out.println("Succesfully set the values");
		return new Student();
	}

}
