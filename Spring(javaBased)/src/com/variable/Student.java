package com.variable;

public class Student {
	
	private int id;
	private String name;
	private String add;
	
	public Student()
	{
		System.out.println("In student const");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	

}
