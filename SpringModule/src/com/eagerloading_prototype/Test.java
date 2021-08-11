package com.eagerloading_prototype;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs= new ClassPathResource("Bean.xml");
		
		BeanFactory bf= new XmlBeanFactory(rs);
		
//		Student s=(Student)bf.getBean("stu");
//      System.out.println(s);
	    
	    
	ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
//		
//		Student s=(Student)ac.getBean("stu");
//       
//		System.out.println(s);
	}

}
