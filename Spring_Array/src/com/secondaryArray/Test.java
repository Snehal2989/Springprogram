package com.secondaryArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_secon.xml");
		
		Certificate ct=(Certificate) ac.getBean("CC");
		
		System.out.println(ct.getName()+" "+ct.getCou());

		Course[] cou = ct.getCou();
		for(Object obj:cou)
		{
			System.out.println(obj);
		}
		
	}

}
