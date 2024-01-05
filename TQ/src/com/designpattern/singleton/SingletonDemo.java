package com.designpattern.singleton;

public class SingletonDemo {
	private static SingletonDemo single_instance;
	public String s;

	private SingletonDemo() {
		s = "Hello I am A String Part Of Singleton Class";

	}

	public static SingletonDemo getIntance() {
		if (single_instance == null)
			single_instance = new SingletonDemo();
		return single_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
