package com.d2array;
import java.util.Scanner;
public class Fixrowvarcol {
	public  void CreateArray() {
	int hmm[][]= new int[3][3];
	hmm[0][0] = 1;
	hmm[0][1] = 2;
	hmm[0][2] = 3;

	hmm[1][0] = 4;
	hmm[1][1] = 5;
	hmm[1][2] = 6;

	hmm[2][0] = 7;
	hmm[2][1] = 8;
	hmm[2][2] = 9;
	
	System.out.println("Enter rows");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	for(int i=0;i<hmm.length;i++) {
		
		System.out.println("Enter"+(i+1) +"column");
		
		int col=sc.nextInt();
		for(int j=0;j<hmm[i].length;j++) 
		System.out.print(hmm[i][j]+" ");
	}
	System.out.println();
	sc.close();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fixrowvarcol obj= new Fixrowvarcol();
		obj.CreateArray();

	}
	

}
