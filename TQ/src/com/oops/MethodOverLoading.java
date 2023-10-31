package com.oops;

public class MethodOverLoading {
	public void add(int i, int j) {
		System.out.println("Addition :- " + (i + j));
	}

	public void add(float i, float j) {
		System.out.println("Addition :- " + (i + j));
	}

	public void sub(int i, int j) {
		System.out.println("Substraction :- " + (i - j));
	}

	public void sub(float i, float j) {
		System.out.println("Substraction :- " + (i - j));
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(20, 10);
		obj.add(10.5f, 20.5f);
		obj.sub(50, 60);
		obj.sub(10.20f, 20.10f);

	}

}
