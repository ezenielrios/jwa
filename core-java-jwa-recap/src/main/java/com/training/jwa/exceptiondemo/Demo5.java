package com.training.jwa.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
 * 
throw and throws

throw is a keyword which we can use inside the method to raise an exception using new keyword
The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
We can throw either checked or unchecked exception. 
The throw keyword is mainly used to throw custom exceptions. 



throws is a keyword that we use alongside method name to delegate the checked exceptions
throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.



 */
public class Demo5 {


	//throws is a keyword that we use alongside method name to delegate the checked exceptions
	public void display1() throws FileNotFoundException {
		System.out.println("Hi");
		FileInputStream fileInputStream = new FileInputStream("h:\\jwa\\readme.md");
		System.out.println("Bye");
	}
	public void display2() throws InterruptedException, FileNotFoundException {
		System.out.println("Hi");
		FileInputStream fileInputStream = new FileInputStream("h:\\jwa\\readme.md");
		System.out.println("Bye");
	}
	public static void main(String[] args) throws  Exception {
		int marks[] = new int[5];

		System.out.println("Welcome to my program");
		Demo5 d = new Demo5();
		d.display1();
		d.display2();
		if(marks[0]==0)
			throw new NullPointerException();
		System.out.println("Thanks for using my program");
	}

}
