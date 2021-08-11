package com.mutable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean1.xml");
		
		Employee ep= (Employee)ac.getBean("emp");
		System.out.println(ep);
		
		// setting another value
		
		ep.setEid(99);
		ep.setEname("Snehal");
		ep.setDesg("Dr");
		System.out.println(ep);
	}

}
