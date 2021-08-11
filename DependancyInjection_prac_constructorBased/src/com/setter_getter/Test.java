package com.setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Student s=(Student)ac.getBean("st");
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.email);
	   System.out.println(s.Course);

	}

}
