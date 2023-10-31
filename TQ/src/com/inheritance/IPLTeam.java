package com.inheritance;
/*Create class IPLTeam with method play. Create child classes of IPLTeam
called as CSK, RCB. In main, call play from child class objects.*/
public class IPLTeam {
	public IPLTeam() {
		System.out.println("i am in default constructor");
	}
	public void play() {
		System.out.println("I am playing Game");
		
	}
	class CSK extends IPLTeam {
		public CSK() {
			System.out.println("I am From CSK Team");
		}
		
		
	}
	class RCB extends IPLTeam{
		public RCB() {
			System.out.println("I am From RCK Team");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPLTeam obj = new IPLTeam();
		System.out.println(obj);
		obj.play();
		

	}

}
