package com.object;

public class Student {
	
	int rollno;
	String name;
	String addr;
	Address add;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + ", add=" + add + "]";
	}

	public Student(int rollno, String name, String addr, Address add) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
		this.add = add;
	}

}
