package com.object;

public class Address {
	
	String areaname;
	String cityname;
	
	
	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", cityname=" + cityname + "]";
	}


	public Address(String areaname, String cityname) {
		super();
		this.areaname = areaname;
		this.cityname = cityname;
	}
	
	
	

}
