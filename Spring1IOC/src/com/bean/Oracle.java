package com.bean;

public class Oracle implements Connection{

	@Override
	public void rollack() {
		System.out.println("Rollback of Oracle");
		
	}

	@Override
	public void commit() {
		System.out.println("Commit of Oracle");
		
	}

}
