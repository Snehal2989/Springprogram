package com.object;

public class Company {
	
	private int cid;
	private String cname;
	private Employee emp;
	
	public Company(int cid, String cname, Employee emp) {
	
		this.cid = cid;
		this.cname = cname;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", emp=" + emp + "]";
	}
	
	

}
