package com.collection;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Mycollection mcol = (Mycollection)ac.getBean("mycoll");
		System.out.println(mcol);
		
		List list_cou = mcol.getMycourse();
		Iterator itr=list_cou.iterator();
		while(itr.hasNext())
		{
			String s = (String) itr.next();
			System.out.println("Course is "+s);
		}
	}

}
