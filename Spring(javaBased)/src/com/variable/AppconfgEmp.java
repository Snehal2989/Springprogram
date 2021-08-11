package com.variable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppconfgEmp {

	
	@Bean
	public Employee e()
	{
		System.out.println("Setting values of employee");
		Employee e1= new Employee(110,"Rushikesh","Engg");
	
	     return new Employee(201,"Robby","designer");// if return e1 then return above value ,and while returning if u add new value then return that value
	}
}
