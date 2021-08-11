package com.object;

public class Employee {
	
	private int eid;
	private String ename;
	private String edesgn;
	private Company comp;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesgn=" + edesgn + ", comp=" + comp + "]";
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


	public String getEdesgn() {
		return edesgn;
	}


	public void setEdesgn(String edesgn) {
		this.edesgn = edesgn;
	}


	public Company getComp() {
		return comp;
	}


	public void setComp(Company comp) {
		this.comp = comp;
	}


	
	
	
	

}
