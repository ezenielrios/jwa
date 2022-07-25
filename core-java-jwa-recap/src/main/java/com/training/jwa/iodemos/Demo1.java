package com.training.jwa.iodemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File myfile = new File("hello.txt");		
		File myFolder1 = new File("revature");
		
		System.out.println("File exists : "+ myfile.exists());
		
		if(myfile.exists()) {
			System.out.println("File exists and deleted");
			myfile.delete();
			myFolder1.delete();
		}
		else {
			myfile.createNewFile();
			myFolder1.mkdir();
			System.out.println("Created new file and folder: "+myfile.getName());
		}
		
	}
}
