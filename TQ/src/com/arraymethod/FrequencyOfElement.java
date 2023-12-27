package com.arraymethod;

/*14.	WAP to count frequency of each element in an array.*/
public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 4, 3, 6, 9, 8, 9 };
		

		for (int i = 0; i < a.length; i++) {
			int frequency = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					frequency++;
				}
				
			}
			System.out.println(a[i]+"="+frequency);
			

		}
		

	}

}
