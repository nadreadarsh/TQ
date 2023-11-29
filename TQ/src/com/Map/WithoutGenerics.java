package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class WithoutGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WAP to add elements to a HashMap without using generics (ie do not use <>)
		 * and print content of it. Use Integer as Key and String as Value. In second
		 * HashMap add elements of String type as Key and Integer as Value.
		 */

//		HashMap hml = new HashMap();
//		System.out.println("Useing Integer as a key and String As A Value: ");
//		hml.put(12, "Akash");
//		hml.put(125,"Sainath");
//		hml.put(24,"Shivraj");
//		hml.put(63,"Harsh");
//		hml.put(45,"Sopan");
//		System.out.println(hml);
//		System.out.println();
//		
//		HashMap hml2 = new HashMap();
//		System.out.println("Using String as a key and Integer as a value: ");
//		hml2.put("Akash",12);
//		hml2.put("Sainath",25);
//		hml2.put("Shivraj",24);
//		hml2.put("Harsh",63);
//		hml2.put("Sopan",45);
//		System.out.println(hml2);

		/*
		 * WAP to get all the entries from a HashMap. Iterate the entries and print the
		 * Key & Value values WAP to get only the Keys from a HashMap WAP to get only
		 * the Values from a HashMap
		 */
//		HashMap<Integer,String>hml=new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125,"Sainath");
//		hml.put(24,"Shivraj");
//		hml.put(63,"Harsh");
//		hml.put(45,"Sopan");
//		System.out.println(hml);
//		System.out.println();
//		HashMap<Integer,String>c=new HashMap<>(hml);
//		System.out.println(c);
//		System.out.println(hml.values());
//		
//		System.out.println();
//		System.out.println("Size of Map:- "+hml.size());
//		
//		System.out.println();
//		System.out.println("Iterating using enhance for loop");
//		for(Integer s:hml.keySet()) {
//				System.out.println(s+" "+hml.get(s));
//		}
//		System.out.println();
//		System.out.println("");
//		
//		Set<Entry<Integer,String>> set =hml.entrySet();
//		for(Entry<Integer,String>hm: set) {
//			System.out.println("Showing all keys");
//			System.out.println(hm.getKey());
//			System.out.println();
//			System.out.println("Showng all value");
//			System.out.println(hm.getValue());
//		}
		// WAP to copy all of the mappings from the specified HashMap to another map
//		HashMap<Integer,String>hml=new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125,"Sainath");
//		hml.put(24,"Shivraj");
//		hml.put(63,"Harsh");
//		hml.put(45,"Sopan");
//		System.out.println("Original Map");
//		System.out.println(hml);
//		System.out.println();

//		System.out.println("Copy one map to another map");
//		HashMap<Integer,String>=new HashMap<>(hml);
//		System.out.println(c);
//		System.out.println();
//		System.out.println("Copy one map to another map using clone method");
//		System.out.println(hml.clone());

		// WAP to search for an element from HashMap using key

//		HashMap<Integer, String> hml = new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125, "Sainath");
//		hml.put(24, "Shivraj");
//		hml.put(63, "Harsh");
//		hml.put(45, "Sopan");
//		System.out.println("Original Map");
//		System.out.println(hml);
//		System.out.println();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the key");
//		Integer pin = sc.nextInt();
//
//		Set<Integer> set = hml.keySet();
//		for (Integer k : set) {
//			if (k == (pin)) ;
//				System.out.println(hml.get(k));
//			
//		}
		// WAP to test if a HashMap contains a mapping for the specified key (use Method
		// : Containskey())
		
//		HashMap<Integer, String> hml = new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125, "Sainath");
//		hml.put(24, "Shivraj");
//		hml.put(63, "Harsh");
//		hml.put(45, "Sopan");
//		System.out.println("Original Map");
//		System.out.println(hml);
//		System.out.println();
//		System.out.println(hml.containsKey(12));
//		System.out.println(hml);
//		System.out.println();
//		System.out.println(hml.containsValue("Adarsh"));
//		System.out.println(hml);
		
		//WAP to remove an element from HashMap using key
//		HashMap<Integer, String> hml = new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125, "Sainath");
//		hml.put(24, "Shivraj");
//		hml.put(63, "Harsh");
//		hml.put(45, "Sopan");
//		System.out.println("Original Map");
//		System.out.println(hml);
//		System.out.println();
//		System.out.println(hml.remove(12));
//		System.out.println(hml);
//		System.out.println(hml.remove(12,"Akash"));
//		System.out.println(hml);
		
		
//		 WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries from Map)
//		HashMap<Integer, String> hml = new HashMap<>();
//		hml.put(12, "Akash");
//		hml.put(125, "Sainath");
//		hml.put(24, "Shivraj");
//		hml.put(63, "Harsh");
//		hml.put(45, "Sopan");
//		System.out.println("Original Map");
//		System.out.println(hml);
//		System.out.println();
//		Set<Integer>set=hml.keySet();
//		Iterator<Integer>itr=set.iterator();
//		
//		while(itr.hasNext()) {
//			itr.next();
//			itr.remove();
//		}
//		System.out.println(hml);
		
		// WAP to create a map using Custom class as key and any other JDK provided object as value
		HashMap<Integer, String> hml = new HashMap<>();
		hml.put(12, "Akash");
		hml.put(125, "Sainath");
		hml.put(24, "Shivraj");
		hml.put(63, "Harsh");
		hml.put(45, "Sopan");
		System.out.println("Original Map");
		System.out.println(hml);
		System.out.println();
		
	
	

	}

}
