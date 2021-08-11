package com.prac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext ac= new ClassPathXmlApplicationContext("Bean_Name.xml");
		 
		 
		 // For By name
		 
		 System.out.println("student details");
		 Student s=(Student)ac.getBean("st");
		 System.out.println(s.getRollmo());
		 System.out.println(s.getSnmae());
		 System.out.println(s.getAdd().getCity());
		 System.out.println(s.getAdd().getPincode());
		 
		 System.out.println();
		 System.out.println("Employee details");
		 Employee e=(Employee)ac.getBean("emp");
		 System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEadd().getCity()+" "+e.getEadd().getPincode());
		 
		 
		 
	}

}
