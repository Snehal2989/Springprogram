package com.override;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Student st = (Student)ac.getBean("stu");
		System.out.println(st.getRollno());
		System.out.println(st.getSname());
		System.out.println(st.getSaddr());
        // by using setter getter v can change the value of student thats y mutuable 
		// by using constructir b cant change the value thats y immuttable
	}

}
