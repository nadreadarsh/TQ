package com.TreeSet;

import java.util.TreeSet;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>t=new TreeSet<>();
		t.add(15);
		t.add(54);
		t.add(26);
		t.add(87);
		t.add(32);
		t.add(56);
		TreeSet<Integer>t1=new TreeSet<>();
		t1.add(45);
		t1.add(25);
		t1.add(05);
		t.addAll(t1);
		for(Integer x:t)
			System.out.println(x);

	}

}
