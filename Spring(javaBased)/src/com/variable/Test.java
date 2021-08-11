package com.variable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Appconfg.class);
		
		Student stu = (Student) ac.getBean("st"); // here v r unable to display the value bz value is changed ,v r using previous one
       
		System.out.println("------------");
		
		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAdd());
	}

}
