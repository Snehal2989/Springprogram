package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appcong {

	
	@Bean
	public Mycollection myc()
	{
		Mycollection my= new Mycollection();
		
		
		List mylist=new ArrayList();
		mylist.add("Pinki");
		mylist.add(5);
		mylist.add("Akshay");
		mylist.add(20);
		
		my.setMylist(mylist);
		
	
	    return my;
	
	}
}
