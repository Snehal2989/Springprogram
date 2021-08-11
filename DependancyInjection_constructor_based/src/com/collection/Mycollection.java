package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Mycollection {

	List City;
	Set State;
	Map Area;
	Properties prop;
	
	public Mycollection(List city, Set state, Map area, Properties prop) {
		super();
		City = city;
		State = state;
		Area = area;
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Mycollection [City=" + City + ", State=" + State + ", Area=" + Area + ", prop=" + prop + "]";
	}
	
	
	
}
