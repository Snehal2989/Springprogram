package com.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_obj.xml");
		
		Student s=(Student)ac.getBean("st");
		System.out.println("Info of 1st student");
		System.out.println(s);
		
		Student s1=(Student)ac.getBean("st1");
		System.out.println("Info of 2nd student");
		System.out.println(s1);

	}

}
