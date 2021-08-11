package com.calculator;

import java.util.Scanner;

public class Cal_Switch {
	int num1;
	int num2;
	
	Scanner sc= new Scanner(System.in);
	
	public void add()
	{
		System.out.println("Enter the first num");
		int x=sc.nextInt();
		System.out.println("Enter the second num");
		int y= sc.nextInt();
		int add=x+y;
		System.out.println("Addition is "+add);
	}

	public void sub()
	{
		System.out.println("Enter the first num");
		int x=sc.nextInt();
		System.out.println("Enter the second num");
		int y= sc.nextInt();
		int add=x-y;
		System.out.println("Subtraction  is "+add);
	}
	
	public void mul()
	{
		System.out.println("Enter the first num");
		int x=sc.nextInt();
		System.out.println("Enter the second num");
		int y= sc.nextInt();
		int add=x*y;
		System.out.println("Multiplication is "+add);
	}
	
	
	public void div()
	{
		System.out.println("Enter the first num");
		int x=sc.nextInt();
		System.out.println("Enter the second num");
		int y= sc.nextInt();
		int add=x/y;
		System.out.println("Division is "+add);
	}
}
