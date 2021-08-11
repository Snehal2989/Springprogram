package com.collecction;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_coll.xml");
		
		MyCollection mc=(MyCollection)ac.getBean("mycol");
		//System.out.println(mc);
	  
		//mc.mylist; bz of privte v cant call so have to write only getter method
		
		List list = mc.getMylist();
		System.out.println("Name of student");
	   for(Object l:list)
	   {
		   System.out.println(l);
	   }
	
	   System.out.println();
	   
	   
	   
	   Set myset = mc.getMyset();
	   Iterator itr= myset.iterator();
	   while(itr.hasNext())
	   {
		   String o1 = (String) itr.next();
		   System.out.println("Salary is "+o1);
	  }
	   
	   
	   System.out.println();
	   
	   
	   Map mymap = mc.getMymap();
	  Set keySet = mymap.keySet();
	  for(Object o:keySet)
	  {
		  System.out.println("City number is"+o);
		  System.out.println("City name is"+mc.getMymap().get(o));
	  }
	  
	  System.out.println();
	  
	  Properties myprop = mc.getMyprop();
	  Set<Entry<Object, Object>> set = myprop.entrySet();
//	  Iterator<Entry<Object, Object>> itr2=set.iterator();
//	  while(itr2.hasNext())
//	  {
//		  Entry<Object, Object> e= itr2.next();
//		
//		 System.out.println(e);
//	  }
		   
	  for(Entry<Object, Object> et:set)
	  {
		  System.out.println(et);
		//  System.out.println(mc.getMyprop().get(et)); gives null
	  }
	   }
	}


