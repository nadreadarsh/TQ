package com.collections;

public class TwoGen<T, V> {

	T obj1;
	V obj2;

	public TwoGen(T obj1, V obj2) {

		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	void showType() {
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGen<Integer, String> obj = new TwoGen<Integer, String>(1, "Sunish");
		obj.showType();

	}

}
