package com.arraymethod;

import java.util.Arrays;

public class SmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]= {111,254,364,464,554,46};
		int small = m[0];
		for(int i=0;i<m.length;i++) {
			if(small>m[i]) {
				small=m[i];
			}
		}
		int min_2=small;
		for(int i=0;i<m.length;i++) {
			if(m[i]<small) {
				min_2=m[i];
			}
		}
		System.out.println(small);
	
	}

}
