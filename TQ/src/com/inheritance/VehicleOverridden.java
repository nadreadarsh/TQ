package com.inheritance;

/*WAP to create class Vehicle with methods accelerate(long mph) 
 *with long type parameter ,stop(),run() all method return string type of value.
 *Create class car which extends Vehicle implement accelerate(long mph)differently in car class.*/
public class VehicleOverridden {
	public void accelerate(long mph) {
		String i = "Bike run 60000 mph to reach destination";
		System.out.println(i);

	}

	public void stop() {
		String j = "Bike stops at 60km after reaching destination";
		System.out.println(j);

	}

	public void run() {
		String k = "After reachigndestination i ran to my house";
		System.out.println(k);

	}

	class Car extends VehicleOverridden {
		public void accelerate() {
			System.out.println("I am riding a bike");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleOverridden obj = new VehicleOverridden();
		System.out.println(obj);

		obj.accelerate(8000);
		obj.stop();
		obj.run();

	}

}
