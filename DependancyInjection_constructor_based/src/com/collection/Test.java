package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		Mycollection col = (Mycollection)ac.getBean("Mycol");
		System.out.println(col);

		List lcity = col.City;
		for(Object cty:lcity)
		{
			System.out.println(cty);
		}
		
		Set st = col.State;
		for(Object state:st)
		{
			System.out.println("State is "+state);
		}
		
		
		Map map = col.Area;
		Set es = map.entrySet();
		Iterator itr=es.iterator();
		while(itr.hasNext())
		{
			Object o1 = itr.next();
			//System.out.println(o1);
			
		}
	}

}
