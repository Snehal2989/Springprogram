package com.array;

import java.util.Arrays;

public class Student {
	
	private int rollno;
	private String name;
	private long[] mbno;
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mbno=" + Arrays.toString(mbno) + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long[] getMbno() {
		return mbno;
	}
	public void setMbno(long[] mbno) {
		this.mbno = mbno;
	}
	
    
}
