package com.beanprac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Connection;

public class Test {

	public static void main(String[] args) {
		Resource rs= new ClassPathResource("Bean.xml");
		
		BeanFactory bf= new XmlBeanFactory(rs);
		
		Welcome w= (Welcome) bf.getBean("con");
		
		w.course();
		w.student();
	}

}
