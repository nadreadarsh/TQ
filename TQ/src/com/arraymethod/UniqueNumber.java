package com.arraymethod;

/*12.	WAP to print all unique elements in the array.*/
public class UniqueNumber {
	public  void nonReapeating(int a[], int n) {
		int count;
		for (int i = 0; i < n; i++) {
			if (a[i] == '$')
			continue;
			count=1;

			for (int j = i + 1; j < n; j++) {
				if(a[i]==a[j]){
					count++;
					a[j]='$';
				}

			}
			if(count==1);
			System.out.println(a[i]+" ");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,45,12,15,15};
		UniqueNumber obj = new UniqueNumber();
		obj.nonReapeating(arr, 0);
		
		
		
		
		

	}

}
