package com.oops;

public class Constructor {
	int age;

//Constructor and class name must same.
	public Constructor() {
		this(23);
		System.out.println("Default Constructor");
	}

	public Constructor(int a) {
		System.out.println("This Is Using methodoverriding");
		this.age = a;
		System.out.println(age);

	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor();

	}

}
