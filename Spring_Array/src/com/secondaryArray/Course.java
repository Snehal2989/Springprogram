package com.secondaryArray;

public class Course {
	
	private String name;
	private String duration;
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
