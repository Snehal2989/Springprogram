package com.Qualifier_const;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int eid;
	private String ename;
	@Autowired
	@Qualifier("eaddr")
	private Address addr;
	
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
	}



	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	

}
