package com.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Student s=(Student)ac.getBean("st");
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.add.city);
		System.out.println(s.add.pincode);

	}

}
