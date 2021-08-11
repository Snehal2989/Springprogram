package com.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Appconf.class);
		
		Employee ep1=(Employee)ac.getBean("get");
		System.out.println("****");
		System.out.println(ep1);

	}

}
