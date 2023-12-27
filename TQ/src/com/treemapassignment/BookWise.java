package com.treemapassignment;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeMap;

import com.arrayslistdemo.Book;

public class BookWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap<>();
//		tmap.put(new Book(101, "NeverTheLess", "J.K.Rowling", 1250), 156);
//		tmap.put(new Book(102, "Rich Dad Poor Dad", "Robert Kiyosaki", 250), 166);
//		tmap.put(new Book(103, "Fantastic Beast", "J.K.Rowling", 1050),641);
//		tmap.put(new Book(104, "The Alchemist", "Paulo Coelho", 450),435);
//		tmap.put(new Book(105, "Why we want you to be rich", "Robert Kiyosaki", 350),136);
		tmap.put(15, "Abhishek");
		tmap.put(10, "Sunish");
		tmap.put(61, "Bhakti");
		tmap.put(25, "Yogesh");
		tmap.put(45, "Suraj");
		tmap.put(24, "Yogesh");

		System.out.println(tmap);
//		System.out.println("Print in descending order");
//		NavigableSet<Integer>ni=tmap.descendingKeySet();
//		System.out.println(ni);
//		tmap.clear();
//		System.out.println(tmap);
		System.out.println(tmap.descendingKeySet());
		System.out.println("Ceilling key: " + tmap.ceilingKey(23));

//		System.out.println("First Key: "+tmap.firstKey());
//		System.out.println("Last key: "+tmap.lastKey());
		System.out.println(tmap.floorKey(11));
		System.out.println(tmap.floorEntry(11));
		
		System.out.println(tmap.lowerKey(11));
		System.out.println(tmap.lowerEntry(11));
		
		System.out.println(tmap.lastEntry());
		System.out.println(tmap.firstEntry());
		
		
		
		
		
		
		
		
		
		
		

	}

}
