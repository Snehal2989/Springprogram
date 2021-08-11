package com.variable;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppScanner {
	
	Scanner sc= new Scanner(System.in);
	@Bean
	public Course_scanner cou()
	{
 //   Course_scanner c= new Course_scanner();
//		System.out.println("Enter the course id");
//		c.setCid(sc.nextInt());
//		System.out.println("Enter the course name");
//		c.setCname(sc.next());
//		System.out.println("Enter the Course duration");
//		c.setDuration(sc.next());
//		
		
		
		System.out.println("Enter the cid");
		int id=sc.nextInt();
		System.out.println("Enter the cname");
		String name=sc.next();
		System.out.println("Enter the duration");
		String dur=sc.next();
		Course_scanner c= new Course_scanner(id,name,dur);
		
		return c;
	}

}
