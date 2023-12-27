package com.Map;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is object oriented programming language";
		String[] arr = str.split(" ");
		
		System.out.println(Arrays.toString(arr));

		HashMap<String, Integer> map = new HashMap<>();
		for (String c:arr) {
			
			if (map.containsKey(c)) {
				int s = map.get(c);
				map.put(c, s + 1);
			} else {
				map.put(c, 1);

			}
		}
		System.out.println(map);

	}

}
