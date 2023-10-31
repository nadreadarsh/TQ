package com.abstraction;

import com.interfacedemo.printable;

public class Circle extends Shape implements printable {
	double r;
	final double pi = 3.14;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calculatearea() {
		return pi * r * r;

	}

	public static void main(String[] args) {
		Circle obj = new Circle(3.5);
		System.out.println(obj.calculatearea());
		System.out.println(obj.n);
		Shape s = new Circle(2.5);
		Shape arr[] = new Shape[1];
		arr[0] = new Circle(1.5);
	}

	public void show() {
		System.out.println("I am in show in circle");
	}

}
