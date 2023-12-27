package com.abstraction;

/*Create an abstract class Machine with an implemented / concrete method
rotate and an abstract method crush. Create a class Juicer which extends this
abstract class Machine and implements method crush. Now, add another
method filter in the class Juicer. In main method,
a. Create an object of type Juicer and calls its crush, rotate and filter
methods.
b. Create an object of type Juicer with reference variable of Machine
(Machine m = new Juicer). Check the methods available to m.*/
public abstract class Machine {

	public void rotate() {
		System.out.println("Rotate method in Machine class");
	}

	public abstract void crush();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juicer j = new Juicer();
		j.crush();
		j.filter();
		j.rotate();
		Machine m = new Juicer();
		m.crush();
		m.rotate();
		Mixer mi = new Mixer();
		mi.crush();
		m.rotate();
		mi.blend();

	}

}

class mixerJuicer extends Machine {
	public void crush() {
		System.out.println("Crush method in Juicer Class");
	}

	public void filter() {
		System.out.println("Filter method in Juicer Class");
	}
}

class Mixer extends Machine {
	public void crush() {
		System.out.println("Crush method in Mixer class");
	}

	public void blend() {
		System.out.println("Blend Method in Mixer Class");
	}
}
