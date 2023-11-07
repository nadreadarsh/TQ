package com.Basic_String;

import java.util.Arrays;

/*WAP to split string into 2 tokens where string is “HELLO$WORLD”*/
public class Split_String_to_token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HELLO$WORLD";
		char ch[]=s.toCharArray();
		String str[] = s.split("\\$",3);
		System.out.println(Arrays.toString(str));
		//s.split("//$",2);
		//System.out.println(s.split(s));
//		int t=0;
//		
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]=='$') {
//				t=1;
//			}
//			
//			}
//		char f[] =new char[t];
//		char d[]= new char[ch.length-(t+1)];
//		int j=0;
//		for(int i=0;i<ch.length;i++) {
//			if(i<t) {
//				f[i]=ch[i];
//			}
//			if(i>t) {
//				d[j]=ch[i];
//			}
//
//		}
//		}
			
		
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]=='$') {
//				ch[i]=' ';
//				
//			}
		
		
			System.out.println(Arrays.toString(str));
			
			}
	}


