package com.training.jwa.abstractandinterface;
//abstract class
public abstract class Animal {
	public void sleep() {
		System.out.println("Animal sleeps by closing eyes");
	}
	public abstract void eat();
}
abstract class Feline extends Animal{
	
}