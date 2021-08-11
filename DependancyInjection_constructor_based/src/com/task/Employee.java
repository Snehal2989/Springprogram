package com.task;

public class Employee {
	
	private int eage;
	private String ename;
	private Adharcard adhar;
	
	
	@Override
	public String toString() {
		return "Employee [eage=" + eage + ", ename=" + ename + ", adhar=" + adhar + "]";
	}


	public Employee(int eage, String ename, Adharcard adhar) {
		super();
		this.eage = eage;
		this.ename = ename;
		this.adhar = adhar;
	}
	

}
