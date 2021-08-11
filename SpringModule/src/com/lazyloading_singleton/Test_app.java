package com.lazyloading_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_app {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		//	Course c=(Course)ac.getBean("Cou");
			
	    // System.out.println(c);

	// here if u comment line 11,13 still intialise the constructor ,but when u call getbean then it create object
	//     totally opoosite to bean
	
	
	}

}
