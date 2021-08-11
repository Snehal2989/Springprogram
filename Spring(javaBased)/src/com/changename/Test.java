package com.changename;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Appconfg.class);
		
		Student s1=(Student)ac.getBean("s11");// here if u call by previous name it print all data except add
		                                     // and if u call by new name it will print data plus address
		System.out.println("snehal-------------");
		System.out.println(s1);

	}

}
