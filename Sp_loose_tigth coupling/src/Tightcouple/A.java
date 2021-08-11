package Tightcouple;

public class A {
	
	B b;
	
	public A()
	{
		System.out.println("const A");
		b=new B();
	}
	
	public void m1()
	{
		//System.out.println("m1 of A");
		//B b= new B();
		b.m2();
	}
	

}
