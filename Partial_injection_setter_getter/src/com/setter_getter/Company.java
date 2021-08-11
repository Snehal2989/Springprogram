package com.setter_getter;

public class Company {
	
	private int cid;
	private String cname;
	private String caddr;
	
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", caddr=" + caddr + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	
	
	

}
