package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Annotation {

	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("Bean.xml");
		
		Connection c= (Connection) apc.getBean("con");
		c.commit();
		c.rollack();

	}

}
