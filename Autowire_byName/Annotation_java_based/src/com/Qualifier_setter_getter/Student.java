package com.Qualifier_setter_getter;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int sid;
	private String name;
	@Autowired
	private Address addr;
	
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
