package com.arraymethod;

import java.util.Arrays;

public class DuplicateElements {
	public static  void duplicateFind() {
		int num[]= {1,2,3,1,2,5,7,2,3};
		
		for(int i=0;i<num.length;i++) {
			boolean isDuplicate=false;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					isDuplicate=true;
					break;
					//break out of the inner loop as a duplicate
				}
				
			}
			if(isDuplicate) {
				//check if number has not been printed as duplicate
				boolean isNotPrinted=true;
				for(int k=i-1;k>0;k--) {
					if(num[i]==num[k]) {
						isNotPrinted=false;
						break;
					}
				}
				if(isNotPrinted) 
				{
					System.out.println(num[i]+" is duplicate number.");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElements obj = new DuplicateElements();
		obj.duplicateFind();
		

	}

}
