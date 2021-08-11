package com.Qualifier_const;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
	
	@Bean
	public Employee s()
	{
		Employee s= new Employee(1,"Dilip");
		return s;
	}

	@Bean
	public Company c()
	{
		Company c=new Company(101,"Tata");
		
		return c;
	}
	
	@Bean
	public Address addr()
	{
		Address a= new Address("Maval","pune");
		
		return a;
	}
	
	@Bean
	public Address eaddr()
	{
		Address a1= new Address("Hingana","Nagpur");
		
		return a1;
	}
}
