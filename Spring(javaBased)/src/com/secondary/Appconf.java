package com.secondary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconf {
	
	@Bean
	public Address a()
	{
		Address ad= new Address();
		ad.setArea("Akurdi");
		ad.setCity("Pune");
		ad.setPincode(440036);
		return ad;
	}
	
	@Bean
	public Student s()
	{
		
		Student st= new Student();
		st.setSid(1);
		st.setName("Sonu");
		st.setAdd(a());
		return st;
	}

}
