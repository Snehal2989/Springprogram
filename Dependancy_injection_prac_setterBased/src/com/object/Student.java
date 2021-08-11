package com.object;

import java.util.List;

public class Student {
	
	private int sid;
	private String sname;
	private int sage;
	private Address addr;
	private List Course;
	
	
	public List getCourse() {
		return Course;
	}
	public void setCourse(List course) {
		Course = course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", addr=" + addr + ", Course=" + Course
				+ "]";
	}
	

	
}
