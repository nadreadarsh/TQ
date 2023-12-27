package com.treemapassignment;

import java.util.Collections;
import java.util.TreeMap;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<Integer, String> tmap = new TreeMap<>();
		TreeMap <Integer,String> tmap=new TreeMap<>(Collections.reverseOrder());

		tmap.put(15, "Abhishek");
		tmap.put(10, "Sunish");
		tmap.put(61, "Bhakti");
		tmap.put(25, "Yogesh");
		tmap.put(45, "Suraj");
		tmap.put(24, "Yogesh");
		System.out.println(tmap);
		

	}

}
