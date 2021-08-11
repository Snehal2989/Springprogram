package com.ambiguty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_arg.xml");
		
		Addition a=(Addition) ac.getBean("adi");
   
		System.out.println(a);
		a.add();// by default it call string one constructor
	}

}
