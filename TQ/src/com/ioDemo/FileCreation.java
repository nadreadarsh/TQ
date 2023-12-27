package com.ioDemo;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create file in folder
		File obj = new File("F:\\filename2.txt/filename.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("File Name: "+obj.getName());
			}
			else {
				System.out.println("File Already Exists");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Parent Path: "+obj.getParent());
		System.out.println("Abs Path: "+obj.getAbsolutePath());
		System.out.println("Abs Path File: "+obj.getAbsoluteFile());
		System.out.println(obj.isDirectory());
		System.out.println("------------------------------------------");

		
		//Creating directory using mkdir method;
//		if(obj.mkdir()) {
//			System.out.println("File directory: "+obj.getName());
//		}
//		else {
//			System.out.println("File Already Exists");
//		}


	}

}
