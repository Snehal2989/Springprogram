package com.variable;

public class Course_scanner {
	
	private int cid;
	private String cname;
	private String duration;
	
	public Course_scanner(int cid, String cname, String duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course_scanner [cid=" + cid + ", cname=" + cname + ", duration=" + duration + "]";
	}
	
	
	
//	public int getCid() {
//		return cid;
//	}
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public String getDuration() {
//		return duration;
//	}
//	public void setDuration(String duration) {
//		this.duration = duration;
//	}
	
	
	

}
