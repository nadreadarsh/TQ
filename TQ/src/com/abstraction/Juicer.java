package com.abstraction;

public class Juicer extends Machine  {
	public void filter() {
		System.out.println("Make filtered coffee for me");
	}

	@Override
	void crush() {
		System.out.println("Make crush coffee for me");

	}
	public void rotate() {
		System.out.println("Open coffee center");
	}

	public static void main(String[] args) {
		Juicer j;
		j = new Juicer();
		j.filter();
		j.crush();
		System.out.println("-----------------------");
		Machine m;
		m = new Juicer();
		m.crush();
		j.rotate();

	}

}
