package com.abstraction;

class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b;
		b = new SBI();
		System.out.println("Rate Of Interest is: " + b.getRateOfInterest() + "%");

		b = new PNB();
		System.out.println("Rate Of Interest is: " + b.getRateOfInterest() + "%");

	}

}
