package Autowire_2field_const;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {

	
	@Bean
	public Employee e()
	{
		Employee e= new Employee(101,"Ram");
		
		return e;
		
	}
	
	@Bean
	public Mobile m()
	{
		Mobile m= new Mobile(121254514);
		return m;
	}
	
	@Bean
	public Adhar ad()
	{
		Adhar ad= new Adhar(120321020,"Pinki Gupta");
		return ad;
	}
}
