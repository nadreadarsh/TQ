package com.inheritance;

/*WAP to create class Bike with fields color ,speed and  method bikeInfo()
 *  which is show color and speed of bike .
 * create class Pulsar which extends Bike implement bikeInfo() differently child */
public class BikeOverridden {

	public void bikeInfo() {
		String color = "Black";
		int speed = 80;
		System.out.println(color);
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeOverridden obj = new BikeOverridden();
		obj.bikeInfo();

	}

}
