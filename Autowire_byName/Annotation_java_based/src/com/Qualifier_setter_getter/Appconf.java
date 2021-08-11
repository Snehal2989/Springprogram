package com.Qualifier_setter_getter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconf {
	
	@Bean
	public Student s()
	{
		Student s= new Student();
		s.setSid(101);
		s.setName("Raju");
		s.setAddr(a());
		return s;
	}
	
	@Bean
	public Employee e()
	{
		Employee e1=new Employee();
		e1.setEid(111);
		e1.setEname("Durga prasad");
		e1.setAddr(eaddr());
		return e1;
	}
	
	@Bean
	public Address a()
	{
		Address a= new Address();
		a.setAname("Talegao");
		a.setCname("pune");
		return a;
	}
  
	@Bean
	public Address eaddr()
	{
		Address a1= new Address();
		a1.setAname("Manewada");
		a1.setCname("Nagpur");
		return a1;
	}
}
