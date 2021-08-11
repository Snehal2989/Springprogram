package Autowire_2field_setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfg {
	
	@Bean
	public Employee e()
	{
		Employee e= new Employee();
		e.setEid(1122334455);
		e.setEname("Saroj Khan");
		e.setAdh(adh());
		e.setMob(m());
		
		return e;
	}

	@Bean
	public Adhar adh()
	{
		Adhar ad= new Adhar();
		ad.setAdharnum(010101011);
		ad.setName("Sonu kumar");
		
		return ad;
	}
	
	@Bean
	public Mobile m()
	{
		Mobile m= new Mobile();
		m.setMnum(97657787);
		
		return m;
	}
}
