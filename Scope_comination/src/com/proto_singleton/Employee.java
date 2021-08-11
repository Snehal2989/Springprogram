package com.proto_singleton;

public class Employee {
	
	private int eid;
	private String ename;
	private String desg;
	private Company comp;
	
	public Employee()
	{
		System.out.println("Employee const");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	
	
	

}
