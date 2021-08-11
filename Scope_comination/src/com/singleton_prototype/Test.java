package com.singleton_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_Single_proto.xml");
	
	Student st=(Student)ac.getBean("s");
	
	System.out.println("Student" +st);
	System.out.println("Address" +st.getAddr());
	
	//System.out.println(st.getSid()+" "+st.getName()+" "+st.getAddr().getArea()+" "+st.getAddr().getCity()+" "+st.getAddr().getPincode());

	
	
	 Student st1= (Student)ac.getBean("s");
	  System.out.println("Student add is"+st1);
	  System.out.println("Address is "+st1.getAddr());
	  
	  
	//  System.out.println(st1.getSid()+" "+st1.getName()+" "+st1.getAddr().getArea()+" "+st1.getAddr().getCity()+" "+st1.getAddr().getPincode());
	
	  Student st2= (Student)ac.getBean("s");
	  System.out.println("Student add is"+st2);
	  System.out.println("Address is "+st2.getAddr());
	
	}

}
