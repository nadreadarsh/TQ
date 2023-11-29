package com.collections;

//trying demo using Generics method 
public class Gen<V> {
	V obj;

	Gen(V o) {
		obj = o;
	}

	V getObject() {
		return obj;
	}

	void showType() {
		System.out.println(obj.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gen<Integer> obj = new Gen<Integer>(16);

		Integer i = obj.getObject();

		System.out.println(obj.getObject());

		System.out.println(obj.getClass());

		Gen<String> obj1 = new Gen<String>("Java");

		String str = obj1.getObject();

		// obj = obj1;
		System.out.println(obj1.getObject());

		System.out.println(obj1.getClass());
	}

}
