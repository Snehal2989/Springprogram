package com.secondaryArray;

import java.util.Arrays;

public class Certificate {

	private String name;
	private Course[] cou;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCou() {
		return cou;
	}
	public void setCou(Course[] cou) {
		this.cou = cou;
	}
	@Override
	public String toString() {
		return "Certificate [name=" + name + ", cou=" + Arrays.toString(cou) + "]";
	}
	
	
}
