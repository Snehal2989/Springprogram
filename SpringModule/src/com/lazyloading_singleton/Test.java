package com.lazyloading_singleton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		
		// scope should be singleton..
		
		
		Resource rs= new ClassPathResource("Bean.xml");
		
		BeanFactory bf=new XmlBeanFactory(rs);
		
	   //	Course c=(Course)bf.getBean("Cou");  // when u comment these line object is not created so it print nothing while in case of
		                         // application contaxt w/o writing getbean object is created thaty its know as eargly loading
		
		//System.out.println(c);
		
		// if u didnt write sop(c) it will not print the address
		// in lazy loading when u call the get only that time object is created
		//  when u comment sop , it will print nothing
		
		// when u uncommet the sop  that time it print the address
		
		
		
		
	}

}
