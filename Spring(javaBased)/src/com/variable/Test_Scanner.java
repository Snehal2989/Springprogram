package com.variable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_Scanner {

	public static void main(String[] args) {

    ApplicationContext ac= new AnnotationConfigApplicationContext(AppScanner.class);
    
    Course_scanner cs=(Course_scanner) ac.getBean("cou");
    //System.out.println(cs.getCid()+" "+cs.getCname()+" "+cs.getDuration());
    
    System.out.println(cs);
   
    

	}

}
