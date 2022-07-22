package com.training.jwa.exceptiondemo;

public class Demo1 {

	String name;
	public void display() {
		System.out.println("Hi");
		try {
			
			System.out.println(name.length());
		} 
		catch (NullPointerException e) {
			System.out.println("Name cannot be null");
		}
		catch (Exception e) {
			System.out.println("Name cannot be null");
		}
		finally {
			System.out.println("REVATURE");
			
		}
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		Demo1 d = new Demo1();
		d.display();
		System.out.println("Thanks for using my program");
	}

}
