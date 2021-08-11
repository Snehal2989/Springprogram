package com.Qualifier_const;

import org.springframework.beans.factory.aspectj.AnnotationBeanConfigurerAspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

  ApplicationContext ac= new AnnotationConfigApplicationContext(Appconfg.class);
  
  Employee e=(Employee) ac.getBean("s");
  System.out.println(e);
  
  
  Company c=(Company) ac.getBean("c");
  System.out.println(c);
	}

}
