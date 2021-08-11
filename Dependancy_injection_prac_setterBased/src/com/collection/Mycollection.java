package com.collection;

import java.util.*;
import java.util.Properties;

public class Mycollection {

	
	private List sname;
	private Set course;
	private Map Batch;
	private Properties prop;
	
	
	
	public List getSname() {
		return sname;
	}
	public void setSname(List sname) {
		this.sname = sname;
	}
	public Set getCourse() {
		return course;
	}
	public void setCourse(Set course) {
		this.course = course;
	}
	public Map getBatch() {
		return Batch;
	}
	public void setBatch(Map batch) {
		Batch = batch;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	public  String toString()
	{
		return "Mycollection of List of name of student "+sname  +" \n Set of cousres" +course  +
				" \n Map consit of batch id and branch"+Batch +"\n properties of batch "+prop ;
	}
	
}
