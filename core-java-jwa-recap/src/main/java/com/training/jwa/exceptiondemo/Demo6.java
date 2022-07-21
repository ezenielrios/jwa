package com.training.jwa.exceptiondemo;

import java.io.File;
import java.io.FileInputStream;

public class Demo6 {

	int marks[] = new int[5];
	public void display() {
		System.out.println("Hi");
		int result = 10/0;
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		Demo6 d = new Demo6();
		d.display();
		System.out.println("Thanks for using my program");
	}

}
