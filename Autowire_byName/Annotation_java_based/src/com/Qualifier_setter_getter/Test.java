package com.Qualifier_setter_getter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

   ApplicationContext ac= new AnnotationConfigApplicationContext(Appconf.class);
     
    Student s1= (Student) ac.getBean("s");
    System.out.println(s1.getSid()+" "+s1.getName()+" "+s1.getAddr().getAname()+" "+s1.getAddr().getCname());
     
    
    Employee e1=(Employee) ac.getBean("e");
    System.out.println(e1.getEid()+" "+e1.getEname()+" "+e1.getAddr().getAname()+" "+e1.getAddr().getCname());

	}

	
}
