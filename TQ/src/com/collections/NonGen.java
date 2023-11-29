package com.collections;

public class NonGen {
	Object obj;

	NonGen() {

	}

	NonGen(Object o) {
		obj = o;
	}

	void showType() {
		System.out.println(obj.getClass());
	}

	Object getObj() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGen obj = new NonGen(12);
		obj.showType();
		NonGen obj1 = new NonGen("java");
		obj1.showType();
		System.out.println(obj.getObj());
		int i = (int) obj.getObj();
		String str = (String) obj1.getObj();
		obj = obj1;
		int V = (int) obj.getObj();
	}

}
