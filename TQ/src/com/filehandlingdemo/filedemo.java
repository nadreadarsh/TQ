package com.filehandlingdemo;

import java.io.File;
import java.util.Arrays;

public class filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff = new File("F:\\SQL workshop\\nlp-beginner-projects-master\\project1-ML-Sentence Classification");
		System.out.println();
		System.out.println("File Name: "+ff.getName() );
		System.out.println("Path of the file: "+ff.getPath());
		System.out.println("Abs Path: "+ff.getAbsolutePath());
		System.out.println("Parent path : "+ff.getParent());
		System.out.println(ff.exists()?"exists":"not exists");
		System.out.println(ff.canWrite()?"is writable":"its not writable");
		System.out.println(ff.canRead()?"readable":"its not readable");
		System.out.println(ff.isDirectory()?"is directory":"its not directory");
		System.out.println(ff.isFile()?"is file":"its not file");
		System.out.println(ff.isAbsolute()?"is absolute":"its not absolute");
		System.out.println("File last modified :"+ff.lastModified());
		System.out.println("File size :"+ff.length());
		System.out.println("-----------------------------------------------------");
		String[] File = ff.list();
	    System.out.println(Arrays.asList(File));
	}

}
