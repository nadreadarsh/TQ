package com.oops;

public class Arithmatic {
	public void Multi(int i, int j) {
		System.out.println("Multipication: " + i * j);
	}

	public void multi(float i, float j) {
		System.out.println("Multiplication: " + i * j);
	}

	public void multi(double i, double j) {
		System.out.println("Multiplication :" + i * j);
	}

	public void multi(long i, long j) {
		System.out.println("Multiplication :" + i * j);
	}

	public static void main(String[] args) {
		Arithmatic obj = new Arithmatic();
		obj.Multi(2, 5);
		obj.multi(1.5f, 2.5f);
		obj.multi(20, 10);
		obj.multi(125, 200);

	}

}
