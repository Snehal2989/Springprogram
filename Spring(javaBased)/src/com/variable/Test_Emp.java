package com.variable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Emp {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(AppconfgEmp.class);
		
		Employee ep=(Employee)ac.getBean("e");
		System.out.println(ep.eid+" "+ep.ename+" "+ep.desg);

	}

}
