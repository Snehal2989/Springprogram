package com.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("Bean.xml");
		
		College cl = (College)ac.getBean("col");
		System.out.println(cl);

		College cl1=(College)ac.getBean("col");
		System.out.println(cl1);
	}

}
