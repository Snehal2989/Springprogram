package com.constructor;

public class Employee {
	
	int eid;
	String ename;
	String desg;
	double sal;
	int age;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + ", sal=" + sal + ", age=" + age + "]";
	}


	public Employee(int eid, String ename, String desg, double sal, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
		this.age = age;
	}
	
	
	
	

}
