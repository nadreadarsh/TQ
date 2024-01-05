package com.designpattern.singleton;

public class MySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonDemo a = SingletonDemo.getIntance();
		System.out.println(a.hashCode());

		SingletonDemo b = SingletonDemo.getIntance();
		System.out.println(b.hashCode());

		SingletonDemo c = SingletonDemo.getIntance();
		System.out.println(c.hashCode());

		a.s = "I am from a";
		b.s = "I am from b";

		System.out.println("String from x is " + a.s);
		System.out.println("String from y is " + b.s);
		System.out.println("String from z is " + c.s);
		System.out.println("\n");

		c.s = " I am from c";
		System.out.println("String from x is " + a.s);
		System.out.println("String from y is " + b.s);
		System.out.println("String from z is " + c.s);

	}

}
