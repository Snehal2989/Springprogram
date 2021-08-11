package com.secondary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac= new AnnotationConfigApplicationContext(Appconf.class);

		Student s1=(Student) ac.getBean("s");
		
		System.out.println(s1.getSid()+" "+s1.getName()+" "+s1.getAdd().getArea()+" "+s1.getAdd().getCity()+" "+s1.getAdd().getPincode());
	}

}
