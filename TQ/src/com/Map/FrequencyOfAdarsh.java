package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// find frequency of "Adarsh" Using map
public class FrequencyOfAdarsh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "adarsh";

		char ch[] = str.toCharArray();
		System.out.println(ch);

		HashMap<Character, Integer> map = new HashMap<>();
//		Set<Entry<Character, Integer>> set = map.entrySet();
//		Iterator<Entry<Character,Integer>>itr=set.iterator();
//		for(Entry<Character,Integer>obj:set) 
		for (char c : ch) {
			if (map.containsKey(c)) {
				int v = map.get(c);
				map.put(c, v + 1);

			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

	}

}
