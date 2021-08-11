package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("Bean.xml");
		
		Employee e = (Employee)ac.getBean("emp");
		System.out.println(e);
		// v can set the values for employee another object but caqnt set for same object it gives ce..
		//Employee e=new Employee(15,"asa","adsa"1200.00,15);
        Employee e1=new Employee(111,"Dipak","CEO",15000.00,30);
        System.out.println(e1);
		// if u didnt set all value and didnt follow sequence in constructor based then it gives following exception
		//org.springframework.beans.factory.UnsatisfiedDependencyException
	}

}
