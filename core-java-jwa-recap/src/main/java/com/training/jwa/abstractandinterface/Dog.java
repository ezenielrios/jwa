package com.training.jwa.abstractandinterface;
//concrete class
public class Dog extends Animal {

	int dogAge = 4;
	public Dog() {
	}
	@Override
	public void eat() {
		System.out.println("Dog eats meat");
	}
	@Override
	public void sleep() {
		System.out.println("Dog sleeps for 4 hours");
	}
}