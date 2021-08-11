package com.beanprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_App {

	public static void main(String[] args) {
	ApplicationContext ac= new  ClassPathXmlApplicationContext("Bean.xml");
	Welcome w = (Welcome) ac.getBean("con");
  w.course();
  w.student();
	}

}
