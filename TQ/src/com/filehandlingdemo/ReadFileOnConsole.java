package com.filehandlingdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFileOnConsole {
	// for reading we just need inputstream
	FileInputStream fin = null;
	BufferedInputStream bin = null;
	// for writting we just need outputstream 
//	BufferedOutputStream bout= null;
//	FileOutputStream fout = null;
	public ReadFileOnConsole() throws FileNotFoundException   {
		File f = new File(".//src//com//ioDemo//Student.java");
		fin = new FileInputStream(f);
		bin = new BufferedInputStream(fin);
//		fout = new FileOutputStream("F:\\filename2.txt//filename.txt",true);
//		bout = new BufferedOutputStream(fout);
				
	}
	
	public void readContents() throws IOException {
		System.out.println("Reading File On Console");
		int a = bin.read();
		while(a!=-1) {
			System.out.print((char)a);
			a=bin.read();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadFileOnConsole obj = new ReadFileOnConsole();
		obj.readContents();
		

	}

}
