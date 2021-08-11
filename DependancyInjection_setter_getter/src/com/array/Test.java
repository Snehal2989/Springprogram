package com.array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean2.xml");
		Student s=(Student)ac.getBean("st");
		//System.out.println(s);
		
		System.out.println(s.getName());
		//System.out.println(s.getMbno()); it print address tht y iterated it
		
		long[] mbno = s.getMbno();
		for(long l:mbno)
		{
          System.out.println(l);
          
	}
	}
}
