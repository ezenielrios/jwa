package com.training.jwa.exceptiondemo;

public class Demo2 {

	int marks[] = new int[5];
	public void display() {
		System.out.println("Hi");
		System.out.println(marks[10]);
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		Demo2 d = new Demo2();
		d.display();
		System.out.println("Thanks for using my program");
	}

}
