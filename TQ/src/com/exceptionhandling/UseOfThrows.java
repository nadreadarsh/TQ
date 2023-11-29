package com.exceptionhandling;

import java.io.IOException;

public class UseOfThrows {
	public void show()throws IOException
	{
		System.out.println("I am In Parent show()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
class child extends UseOfThrows
{
 @Override
 public void show()throws IOException{
	 super.show();
 }
}
