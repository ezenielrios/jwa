package com.training.jwa.iodemos;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Product product = new Product(17151, "HpLaptop");
		
		ObjectOutputStream out = 
						new ObjectOutputStream(
						new BufferedOutputStream(
						new FileOutputStream(
						new File("pr.txt"))));
		out.writeObject(product);
		
		out.close();
		System.out.println("Saved successfully");
	}

}
