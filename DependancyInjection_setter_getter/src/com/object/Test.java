package com.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		Employee e = (Employee)ac.getBean("emp");
		System.out.println(e);
		System.out.println(e.getComp().getCid());
		System.out.println(e.getComp().getCname());

	}

}
