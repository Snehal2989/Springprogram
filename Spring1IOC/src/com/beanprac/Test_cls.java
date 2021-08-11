package com.beanprac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test_cls {

	public static void main(String[] args) {
		
		Resource rs= new ClassPathResource("Bean.xml");
		
		BeanFactory bf= new XmlBeanFactory(rs);
		
		Clss_ex ce=(Clss_ex)bf.getBean("con");
		
		ce.m1();
		ce.m2();
	}

}
