package com.bean;

public class Mysql implements Connection {

	@Override
	public void rollack() {
		System.out.println("Rollback of Mysql");
		
	}

	@Override
	public void commit() {
		System.out.println("commit of Mysql");
		
	}

}
