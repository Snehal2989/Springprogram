package com.collecction;

import java.util.*;

public class MyCollection {

	private List mylist;
	private Set myset;
	private Map mymap;
	private Properties myprop;
	
	
	public List getMylist() {
		return mylist;
	}


	public Set getMyset() {
		return myset;
	}


	public Map getMymap() {
		return mymap;
	}


	public Properties getMyprop() {
		return myprop;
	}


	
	
	public MyCollection(List mylist, Set myset, Map mymap, Properties myprop) {
		super();
		this.mylist = mylist;
		this.myset = myset;
		this.mymap = mymap;
		this.myprop = myprop;
	}
	
	
}
