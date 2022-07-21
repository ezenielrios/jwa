package com.training.jwa.exceptiondemo;

import java.io.File;

public class Demo4 {

	int marks[] = new int[5];
	public void display() {
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		Demo4 d = new Demo4();
		d.display();
		System.out.println("Thanks for using my program");
	}

}
