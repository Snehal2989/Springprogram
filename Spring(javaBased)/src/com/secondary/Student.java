package com.secondary;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int sid;
	private String name;
	
	@Autowired
	private Address add;
	
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	

}
