package com.collection;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Appcong.class);
		
		Mycollection coll=(Mycollection) ac.getBean("myc");
		
		List lst = coll.getMylist();
	    Iterator itr=lst.iterator();
	    while(itr.hasNext())
	    {
	    	Object o=itr.next();
	    	System.out.println(o);
	    }

	}

}
