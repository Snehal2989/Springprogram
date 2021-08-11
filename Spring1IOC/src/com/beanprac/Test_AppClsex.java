package com.beanprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_AppClsex {

	public static void main(String[] args) {
	ApplicationContext ap= new ClassPathXmlApplicationContext("Bean.xml");
	Clss_ex ce = (Clss_ex)ap.getBean("con");
	ce.m1();
    ce.m2();
	}

}
