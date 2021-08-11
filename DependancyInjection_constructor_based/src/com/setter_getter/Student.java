package com.setter_getter;

public class Student {
	
	int sid;
    String sname;
    String saddr;
    
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + "]";
	}

	public Student(int sid, String sname, String saddr) {
		
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
	}
}
