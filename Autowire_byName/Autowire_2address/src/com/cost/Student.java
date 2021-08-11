package com.cost;

public class Student {
	
	int sid;
	String name;
	String qual;
	Course cse;
	
	
	public Student(int sid, String name, String qual, Course cse) {
		super();
		this.sid = sid;
		this.name = name;
		this.qual = qual;
		this.cse = cse;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", qual=" + qual + ", cse=" + cse + "]";
	}
	
	
	
	

}
