package com.training.jwa.iodemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo4_FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File readFile = new File("quote.txt");
		FileReader fr = new FileReader(readFile); // characters streams
		BufferedReader br = new BufferedReader(fr);
		int res = 0;

		while ((res = br.read()) != -1) // -1 indicates EOF //reading the file
			System.out.print((char) res);

		br.close();
		fr.close();// closing the file

	}
}
