package com.prac;

public class Employee {

	int eid;
	String ename;
	long mbno;
	double sal;
	String addr;
	float weight;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mbno=" + mbno + ", sal=" + sal + ", addr=" + addr
				+ ", weight=" + weight + "]";
	}


	public Employee(int eid, String ename, long mbno, double sal, String addr, float weight) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mbno = mbno;
		this.sal = sal;
		this.addr = addr;
		this.weight = weight;
	}
	
	
}
