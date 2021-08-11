package com.Qualifier_const;

public class Address {
	
	private String aname;
	private String cname;
	public Address(String aname, String cname) {
		super();
		this.aname = aname;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Address [aname=" + aname + ", cname=" + cname + "]";
	}
	

}
