package com.task;

public class Adharcard {
	
	private long adharnum;
	private String adharname;
	
	
	public Adharcard(long adharnum, String adharname) {
		super();
		this.adharnum = adharnum;
		this.adharname = adharname;
	}


	@Override
	public String toString() {
		return "Adharcard [adharnum=" + adharnum + ", adharname=" + adharname + "]";
	}
	
	
	

}
