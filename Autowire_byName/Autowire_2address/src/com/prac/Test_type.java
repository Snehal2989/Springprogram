package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_type {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_Type.xml");

		Student s1=(Student)ac.getBean("st");  // here it gives error bz got 2 add so it confused
		                                       // bz in by_type it serach using class name
												//means in bytype v cant write 2 bean for same

		System.out.println(s1.getRollmo());
		System.out.println(s1.getSnmae());
		
		 System.out.println(s1.getAdd().getCity());
		 System.out.println(s1.getAdd().getPincode());

		 
		Employee e=(Employee)ac.getBean("emp");
		System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEadd().getCity()+" "+e.getEadd().getPincode());
	}

}
