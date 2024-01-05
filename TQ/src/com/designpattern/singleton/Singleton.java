package com.designpattern.singleton;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		// TODO Auto-generated constructor stub
		System.out.println("I am in constructor");
	}
	public static Singleton getInstance() {
		return instance;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
