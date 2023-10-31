package com.inheritance;

public class OverriddenCar extends OverrriddenVehicle {
	public void accelerate() {
		System.out.println("I ride the bike safely");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverriddenCar obj1 = new OverriddenCar();
		obj1.accelerate();
	}

}
