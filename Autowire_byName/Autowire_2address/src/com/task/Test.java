package com.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_task.xml");
		
		Employee e=(Employee)ac.getBean("emp");
		
		System.out.println(e.getEname()+" "+e.getAge());

		System.out.println(e.getAr().getAdharnum()+" "+e.getAr().getName());
	}

}
