package com.training.jwa;

public class StringDemo {

	public static void main(String[] args) {

		// what is the difference between equals method and == operator
		// == checks the reference of two objects
		// equals method checks the value of two objects
		// What is the difference between the two methods of creating Strings?
		/*
		 * 1) by using new keyword 
		 * String data = new String("revature"); 
		 * 2) by initializing directly 
		 * String data1="revature"
		 * 
		 */
		String str1 = "revature";
		String str2 = new String("revature");

		System.out.println(str1 == str2); // ??
		System.out.println(str1.equals(str2)); // ??
		System.out.println(str1.compareTo(str2)); 
	}

}
