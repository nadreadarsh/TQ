package com.abstraction;
/*Above we created an abstract class Machine with an abstract method crush
and a concrete / implemented method rotate. Now create another abstract
class Mixer which extends the abstract class Machine, has method crush
implemented and has an additional concrete method blend. In main create an
object of class of Mixer. Call methods rotate, blend and crush.*/
 class Mixer extends Machine{
	public void blend() {
		System.out.println("Blend coffee");
	}
	
	@Override
	void crush() {
		// TODO Auto-generated method stub
		
		
	}
	public static void main(String[]agrs) {
		
		
		Mixer m = new Mixer();
		m.blend();
		
		
		
		Juicer j = new Juicer();
		j.crush();
		j.rotate();
	}
	

}
