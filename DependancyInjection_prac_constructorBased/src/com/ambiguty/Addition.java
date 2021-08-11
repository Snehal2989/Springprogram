package com.ambiguty;

public class Addition {
	
	int x;
	int y;
	int z;
	
	public Addition(int x, int y) {
		
		System.out.println("consturtor int,int");
		this.x = x;
		this.y = y;
	}
	
	public Addition(double x,double y)
	{
		
		System.out.println("consturtor double,double");
		this.x = (int)x;// cant resolve that y type cast
		this.y = (int)y;
	}
	
	public Addition(String x,String y)
	{
		System.out.println("consturtor String,String");
		this.x = Integer.parseInt(x);// agaun cant convert have to do parseIntrger
		this.y = Integer.parseInt(y);
	}
	
	public void add()
	{
		System.out.println( z=x-y);
	}
	

}
