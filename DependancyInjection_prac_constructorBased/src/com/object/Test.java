package com.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_obj.xml");
		
		Company cp=(Company)ac.getBean("comp");
		System.out.println(cp);
		
	}

}
