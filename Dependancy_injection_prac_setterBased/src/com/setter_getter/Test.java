package com.setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");

		  Employee e1 = (Employee)ac.getBean("emp");
		  System.out.println(e1);
		  
		  Employee e2 =(Employee)ac.getBean("emp1");
		  System.out.println(e2);
	}

}
