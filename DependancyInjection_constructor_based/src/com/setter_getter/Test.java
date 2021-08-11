package com.setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
	
	Student st1 = (Student)ac.getBean("stud");
	System.out.println(st1);

	}

}
