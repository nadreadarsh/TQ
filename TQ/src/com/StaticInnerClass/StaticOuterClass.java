package com.StaticInnerClass;

public class StaticOuterClass {
	static int outer_n;
	String name;
	public StaticOuterClass() {
		// TODO Auto-generated constructor stub
		outer_n=20;
		name = "outer";
	}
	public void outermethod() {
		System.out.println(name);
		System.out.println(outer_n);
	}
	static void displayouterstatic() {
		System.out.println("This is outer static method");
	}
	static class staticinnerclass {
		int inner_n;
		String nameinner;
		public staticinnerclass() {
			// TODO Auto-generated constructor stub
		inner_n=10;
		nameinner = "inner";
		}
		public void showinnerclass() {
			System.out.println(nameinner);
			System.out.println(inner_n);
		//	System.out.println(name);
			// we can not access outer class static variable in inner class
			// 
		}
		static void displayinnerstatic() {
			System.out.println("This is inner class static method");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOuterClass outer = new StaticOuterClass();
		outer.outermethod();
		outer.displayouterstatic();
		staticinnerclass inner = new staticinnerclass();
		inner.showinnerclass();
		inner.displayinnerstatic();
		
		

	}

}

