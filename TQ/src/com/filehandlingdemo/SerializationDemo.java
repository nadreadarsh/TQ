package com.filehandlingdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student obj = new Student(100, "Abhishek", 75f);

		
		FileOutputStream fos=new FileOutputStream(".//src//com//student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(obj);
		System.out.println("Object Saved");
		
		FileInputStream fis=new FileInputStream(".//src//com//student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		obj=(Student) ois.readObject();
		System.out.println("Object shown");
		System.out.println(obj);
		oos.close();
		fos.close();

		

	}

}
