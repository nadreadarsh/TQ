package com.arrayslistdemo;
/*Create arraylist of characters. Remove duplicate characters from the list. 
 * E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}*/
import java.util.ArrayList;
import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> l1 = new ArrayList<>(Arrays.asList('d', 'f', 'g', 'h', 'h', 'd', 'd', 'g', 'f'));
		System.out.println(l1);
		for (int i = 0; i < l1.size(); i++) {
			for (int j = i + 1; j < l1.size(); j++) {
				if (l1.get(i) == l1.get(j)) {
					l1.remove(j);
					j--;
				}
			}
		}
		System.out.println(l1);

	}

}
