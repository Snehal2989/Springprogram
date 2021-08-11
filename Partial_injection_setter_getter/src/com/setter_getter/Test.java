package com.setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Company cp = (Company) ac.getBean("comp");
		System.out.println(cp);
		
		Company cp1=(Company)ac.getBean("comp1");
		System.out.println(cp1);
		
		Company cp2 = (Company)ac.getBean("comp2");
         System.out.println(cp2);
	}

}
