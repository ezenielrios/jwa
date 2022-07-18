package com.training.jwa;

//method calls is stored in stack in java
public class Welcome {
	
	public static void main(String[] args) {
		System.out.println(ScopeVariableDemo.maxAge);
		System.out.println("Hello and welcome to JWA Testing Primer Batch");
		Welcome w = new Welcome();
		w.display();
		System.out.println("Main is done ");
	}
	public void display() {
		System.out.println("Hi I am display method");
		Welcome w1 = new Welcome();
		w1.acceptDetails();
	}
	public void acceptDetails() {
		System.out.println("Hi I am accept details method");
	}
}

