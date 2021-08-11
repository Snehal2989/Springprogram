package com.constr;

public class Student {
	
	int sid;
	String sname;
	Address add;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", add=" + add + "]";
	}

	public Student(int sid, String sname, Address add) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.add = add;
	}
	
	

}
