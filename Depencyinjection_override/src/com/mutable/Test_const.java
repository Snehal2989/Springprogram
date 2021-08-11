package com.mutable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_const {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_const.xml");
		Student_const sc=(Student_const)ac.getBean("stu1");
		System.out.println("Display stu info");
		System.out.println(sc.addr);
		System.out.println(sc.name);
		System.out.println(sc.rollno);
		
		// in constructor based v cant set value to same object,thats y immutable
	}

}
