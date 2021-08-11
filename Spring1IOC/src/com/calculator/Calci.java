package com.calculator;

import java.util.Scanner;

public class Calci {
	
//	First one by direct
//	
//	int x=100;
//	int y=20;
//	int z;
//	
//	
//	public void add()
//	{
//		z=x+y;
//		System.out.println(z);
//	}
//    public void sub()
//    {
//    	z=y-x;
//    	System.out.println(z);
//    }
	
	
	// second approch
//	public void add(int num1,int num2)
//	{
//		int add=num1+num2;
//		System.out.println(add);
//	}
//   public void sub(int num1,int num2)
//   {
//	   int sub=num1-num2;
//	   System.out.println(sub);
//   }

	
	Scanner sc= new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter the first num");
		int a=sc.nextInt();
		System.out.println("Enter the second num");
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("Addition of number is"+add);
	}

	
    public void sub()
	{
		System.out.println("Enter the first num");
		int a=sc.nextInt();
		System.out.println("Enter the second num");
		int b=sc.nextInt();
		int add=a-b;
		System.out.println("Subtraction of number is"+add);
	}
    
    public void Mul()
	{
		System.out.println("Enter the first num");
		int a=sc.nextInt();
		System.out.println("Enter the second num");
		int b=sc.nextInt();
		int add=a*b;
		System.out.println("Multiplication of number is"+add);
	}
    
    public void div()
	{
		System.out.println("Enter the first num");
		int a=sc.nextInt();
		System.out.println("Enter the second num");
		int b=sc.nextInt();
		int add=a/b;
		System.out.println("Division of number is"+add);
	}
}


