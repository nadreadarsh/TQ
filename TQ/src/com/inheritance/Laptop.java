package com.inheritance;

/*Create Class Laptop which has variables noOfUSBPort, processorSpeed of
type int. Create getter, setter methods for the variables. In main method,
1> create Laptop object 2> set values of variables noOfUSBPort,
processorSpeed using setter methods. 3> print variables noOfUSBPort,
processorSpeed using getter methods.*/
public class Laptop {
	int noOfUSBPort, processorSpeed;

	public Laptop() {
		System.out.println("I am In constructor");
	}

	public Laptop(int noOfUSBPort, int processorSpeed) {
		System.out.println("I am in parameterized constructor");
		this.noOfUSBPort = noOfUSBPort;
		this.processorSpeed = processorSpeed;

	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getNoOfUSBPort(int noOfUSBPort) {
		return noOfUSBPort;
	}

	public void setprocessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public int getprocessorSpeed(int processorSpeed) {
		return processorSpeed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj = new Laptop(4, 45);

		obj.setNoOfUSBPort(4);
		System.out.println("Number of USB Ports: " + obj.getNoOfUSBPort(4));
		obj.setprocessorSpeed(45);
		System.out.println("processor Speed: " + obj.getprocessorSpeed(45));
		

	}

}
