package com.training.jwa.iodemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @author tufai
 * Writing to a file
 */
public class Demo3 {

	public static void main(String[] args) throws IOException  {
		File writeFile = new File("product.txt");
		
		if(writeFile.exists()) {
			System.out.println("File :"+writeFile.getName()+ "  exists. please give a new file name");

		}
		else
		{
			FileOutputStream outputStream = new FileOutputStream(writeFile);
			int res=0;
			
			for(int i=65;i<=90;i++)
					outputStream.write(i);
			
			outputStream.close();
			System.out.println("Saved successfully");
		}
	}
}
