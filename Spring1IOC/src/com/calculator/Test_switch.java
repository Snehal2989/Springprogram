package com.calculator;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_switch {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("Bean.xml");
		Cal_Switch cs=(Cal_Switch)ap.getBean("con");
		Scanner sc= new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Select the above choice");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				cs.add();
				break;
				
			case 2:
				cs.sub();
				break;
				
			case 3:
				cs.mul();
				break;
				
			case 4:
				cs.div();
				break;
				
			case 5:
				System.out.println("Invalid input");
				System.exit(0);
			}
		}

	}

}
