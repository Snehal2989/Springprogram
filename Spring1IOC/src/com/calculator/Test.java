package com.calculator;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource rs= new ClassPathResource("Bean.xml");
		
		BeanFactory bf=new XmlBeanFactory(rs);
		
		   Calci c=(Calci)bf.getBean("con");
		   
		   
//      First one by direct 		
//		Calci cl=(Calci)bf.getBean("con");
//		cl.add();
//		cl.sub();

//       Second approach		
//		 Scanner sc= new Scanner(System.in);
//		 System.out.println("Enter the first num");
//		 int num1=sc.nextInt();
//		 System.out.println("Enter the second num");
//		 int num2=sc.nextInt();
//		 c.add(num1, num2);
//		 c.sub(num1, num2);
	
	
	   c.add();
	   c.sub();
	   c.div();
	   c.Mul();
	}

}
