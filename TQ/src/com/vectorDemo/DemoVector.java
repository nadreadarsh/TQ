package com.vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>vec = new Vector<>(10);
		System.out.println(vec.capacity());
		vec.add("Utkarsha");
		vec.add("Bhakti🐒");
		vec.add("Abhishek");
		vec.add("Ganesh");
		vec.add("Sunish");
		vec.add("Yogesh");
		vec.add("Pritam");
		vec.add("Snehal");
		vec.add("Suraj");
		vec.add("Ishwar");
		vec.add("Anjali");
		System.out.println("Size:"+vec.size());
		vec.addElement("Maroti");
		Enumeration<String>vc= vec.elements();
		while(vc.hasMoreElements()) {
			System.out.println(vc.nextElement());
		}
		
		System.out.println(vec.capacity());
	}

}
