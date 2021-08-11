package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final String keySet = null;

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_coll.xml");
		
		Mycollection mc=(Mycollection)ac.getBean("mycoll");
		System.out.println(mc);

		List sname = mc.getSname();
		for(Object nm:sname)
		{
			System.out.println("Student name"+nm);
		}
	
	    Set course = mc.getCourse();
	    Iterator itr= course.iterator();
	    while(itr.hasNext())
	    {
	    	String c = (String)itr.next();
	    	System.out.println("Course name" +c);
	    }
	
	   Map batch_map = mc.getBatch();
	   Set keySet2 = batch_map.keySet();
	   Iterator itr1=keySet2.iterator();
	   while(itr1.hasNext())
	   {
		   Object next = itr1.next();
		  System.out.println(next);// it will print only key
		  
		  System.out.println(mc.getBatch().get(next));// it will print value
	   }
	   
	    Properties prop1 = mc.getProp();
	    Set<Entry<Object,Object>> entrySet = prop1.entrySet();
	    for(Entry<Object,Object> val:entrySet)
	    {
	    	System.out.println(val);
	    	//System.out.println(mc.getProp().get(val)); gives null bz value is outside the tag
	    }
	
	
	}
	

}
