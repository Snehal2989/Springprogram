package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean1.xml");
		Employee emp = (Employee)ac.getBean("emp");
		System.out.println(emp);
		//System.out.println(emp.get);

	}

}
