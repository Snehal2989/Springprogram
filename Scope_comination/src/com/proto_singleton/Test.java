package com.proto_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_proto_singleton.xml");
		
		Employee e1=(Employee) ac.getBean("e");
		System.out.println(e1);
		System.out.println(e1.getComp());
		
		Employee e2=(Employee) ac.getBean("e");
		System.out.println(e2);
		System.out.println(e2.getComp());
		
		
		Employee e3=(Employee) ac.getBean("e");
		System.out.println(e3);
		System.out.println(e3.getComp());
	}

}
