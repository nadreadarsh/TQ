package com.abstraction;

/*BikeAbstract the abstract class that contains
only one abstract method run. It implementation is
provided by the Honda class.*/
 
class Bike extends Honda {

	
	 void run() {
		System.out.println("Running safely");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();

	}

}


