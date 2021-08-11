package com.proto_singleton;

public class Company {
	
	private String name;

	public Company()
	{
		System.out.println("Company const");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
