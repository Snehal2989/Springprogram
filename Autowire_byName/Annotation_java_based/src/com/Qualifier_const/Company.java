package com.Qualifier_const;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	private int cid;
	private String cname;
	@Autowired
	private Address addr;
	
	

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", addr=" + addr + "]";
	}



	public Company(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	

}
