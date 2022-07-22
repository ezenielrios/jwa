package com.training.jwa.exceptiondemo;
/*
 * How you create custom exception in java ?
	By extending exception(checked) or runtimeexception(unchecked)
	By declaring constructors
 */
public class InvalidAge extends Exception{
	public InvalidAge() {
	}
	public InvalidAge(String message) {
		super(message);
	}
}
