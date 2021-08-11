package com.override;

public class Student {
	
	private int rollno;
	private String sname;
	private String saddr;
	
	public Student(int rollno, String sname, String saddr) {
		
		this.rollno = rollno;
		this.sname = sname;
		this.saddr = saddr;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddr=" + saddr + "]";
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	
	

}
