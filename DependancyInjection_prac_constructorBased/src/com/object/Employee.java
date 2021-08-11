package com.object;

public class Employee {
	
	private String ename;
	private String desg;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desg=" + desg + ", salary=" + salary + "]";
	}

	public Employee(String ename, String desg, double salary) {
		super();
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}
	

}
