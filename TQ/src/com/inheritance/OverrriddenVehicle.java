package com.inheritance;
/*WAP to create class Vehicle with methods accelerate(long mph) 
 *with long type parameter ,stop(),run() all method return string type of value.
 *Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/
public class OverrriddenVehicle {
	
	public  void accelerate() {
		System.out.println("I am Riding a bike");
	}
	
	void stop() {
		System.out.println("I Stop the bike");
	}
	void run() {
		System.out.println("I start the bike and run");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverrriddenVehicle obj = new OverrriddenVehicle();
		obj.accelerate();
		obj.run();
		obj.stop();
		System.out.println(obj);

	}

}

