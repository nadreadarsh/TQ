package com.filehandlingdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Write a Java code to write content into the file.
public class ContentIntoFile {
	FileInputStream fin = null;
	FileOutputStream fout = null;
	BufferedInputStream bin = null;
	BufferedOutputStream bout= null;
	public ContentIntoFile() throws FileNotFoundException   {
		File f = new File(".//src//com//ioDemo//Student.java");
		fin = new FileInputStream(f);
		bin = new BufferedInputStream(fin);
		fout = new FileOutputStream("F:\\filename2.txt//filename.txt",true);
		bout = new BufferedOutputStream(fout);
				
	}
	
	public void filecreation() {
		File obj = new File("f://npkeynew.txt");
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
		
	}
	public void writecontent() throws IOException {
		System.out.println("Enter Some data....");
		int data = System.in.read();
		while(data!=45) {
			bout.write(data);
			bout.flush();
			data=System.in.read();
		}
		System.out.println("Contents Written to file..");
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ContentIntoFile obj = new ContentIntoFile();
		
		

	}

}
