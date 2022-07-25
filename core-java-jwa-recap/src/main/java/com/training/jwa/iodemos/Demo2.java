package com.training.jwa.iodemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException  {
		File readFile = new File("quote.txt");
		
		if(readFile.exists()) {
			//write the code to read from file and print
			//What is FileInputStream in java ?
			//Ans : FIS is a byte stream which is used to read the contents of a file
			FileInputStream inputStream = new FileInputStream(readFile);
			int res=0;
			
			while((res = inputStream.read()) != -1)	//-1 indicates EOF 	//reading the file
				System.out.print((char)res);
			
			inputStream.close();//closing the file
		}
		else
		{
			System.out.println("File :"+readFile.getName()+ " does not exists");
		}
	}
}
