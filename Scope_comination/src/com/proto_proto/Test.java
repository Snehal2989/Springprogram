package com.proto_proto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_proto.xml");
	
	Employee em=(Employee) ac.getBean("e");
	System.out.println(em);
	
	Company cp=(Company) ac.getBean("c");
	System.out.println(cp);
	
	
	Employee em1=(Employee) ac.getBean("e");
	System.out.println(em1);
	
	Company cp1=(Company) ac.getBean("c");
	System.out.println(cp1);
	
	
	Employee em2=(Employee) ac.getBean("e");
	System.out.println(em2);
	
	Company cp2=(Company) ac.getBean("c");
	System.out.println(cp2);
	}

}
