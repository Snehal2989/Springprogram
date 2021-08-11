package com.singleton_prototype;

public class Student {
	
	private int sid;
	private String name;
	private Address addr;
	
	public Student()
	{
		System.out.println("In student");
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	

}
