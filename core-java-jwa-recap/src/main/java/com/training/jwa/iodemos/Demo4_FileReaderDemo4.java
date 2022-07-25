package com.training.jwa.iodemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo4_FileReaderDemo4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("quote.txt")));
		int res = 0;

		while ((res = br.read()) != -1) // -1 indicates EOF //reading the file
			System.out.print((char) res);

		br.close();

	}
}
