package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Mycollection {
	
	private List Mycourse;
	private Set Batch;
	private Map Mymap;
	private Properties Myprop;
	public List getMycourse() {
		return Mycourse;
	}
	public void setMycourse(List mycourse) {
		Mycourse = mycourse;
	}
	public Set getBatch() {
		return Batch;
	}
	public void setBatch(Set batch) {
		Batch = batch;
	}
	public Map getMymap() {
		return Mymap;
	}
	public void setMymap(Map mymap) {
		Mymap = mymap;
	}
	public Properties getMyprop() {
		return Myprop;
	}
	public void setMyprop(Properties myprop) {
		Myprop = myprop;
	}
	@Override
	public String toString() {
		return "Mycollection [Mycourse=" + Mycourse + ", Batch=" + Batch + ", Mymap=" + Mymap + ", Myprop=" + Myprop
				+ "]";
	}
	
	

}
