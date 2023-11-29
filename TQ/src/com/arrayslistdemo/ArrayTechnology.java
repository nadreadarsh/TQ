package com.arrayslistdemo;

import java.util.ArrayList;

public class ArrayTechnology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> technology = new ArrayList<>();
		System.out.println(technology.size());
		technology.add("Java");
		technology.add("C#");
		technology.add("Mobiledevelopment");
		technology.add("Java Framework");

		System.out.println(technology);
		System.out.println(technology.size());
		technology.add("Asp dotnet mvc");
		System.out.println(technology);

		technology.remove(2);
		System.out.println(technology);
		boolean f = technology.remove("C#");
		System.out.println(f);
		System.out.println(technology);

		technology.iterator();
		System.out.println(technology);
		
		technology.remove(1);
		System.out.println(technology);
		boolean f1=technology.remove("C#");
		System.out.println(f1);
		System.out.println(technology);
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("maths");
		l1.add("chemistry");
		l1.add("Bio");
		
		technology.addAll(l1);
		System.out.println(technology);
		
		ArrayList<String>l2=new ArrayList<>();
		l2.add("English");
		l2.add("Hindi");
		technology.addAll(2,l2);
		System.out.println(technology);

	}

}
