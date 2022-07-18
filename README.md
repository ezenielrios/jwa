JDK 1.8
Eclipse /IntelliJ

Core Java 
--------------------------


What is Java ?
# Java

Java is an Object Oriented Programming language.
Java is a platform independent language
It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Platform indepdendent
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer
- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems (Raspberry Pis)
- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming




##***  JVM / JRE / JDK

JDK stands for Java Devlopment Kit		- JRE and JVM

JRE stands for Java Runtime Environment	- JVM

JVM stands for Java Virtual Machine

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.



The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.



//Compilation
Checks for syntax errors
Converts the java code into bytecodes


//Execution



Access specifiers in java
====================

4 access specifiers


public
private
default
protected

Hands on - 20 minutes


Customer
	int discount =10;
	int totalBillAmount=85000;

	payBill()
		should display final bill after discount


	applyDiscount()
		
		

	main()

		



	Your final bill after 20 % discount is : 68000 USD


<code>
Solution :

package com.training.jwa;

public class Customer {
	int discount =25;
	int totalBillAmount=100000;
	int finalBillAmount = 0;
	public void payBill()
	{
		applyDiscount();
		System.out.println("Your final bill after discount is : "+finalBillAmount);
	}
	public void applyDiscount() {
		System.out.println("should apply the discount of "+ discount+"% in final amount");
		System.out.println("Applying "+ discount + "%");	//Applying 20%
		finalBillAmount = totalBillAmount - ( totalBillAmount / 100 * discount);
	}
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.payBill();
		
	}

}


</code>

Classes and Objects
======================
 a class is a blueprint for how to create an object. 
an object is an instance of a class

Class							Object
Class is declared using class keyword. For example,class Student{}	Object is created through new keyword. For example, Student s1=new Student();
Class is declared once.					Object is created many times as per requirement.
Class doesn't allocated memory when it is created.		Object allocates memory when it is created.


Object Oriented Concepts
========================
An easy way to remember these is with the acronym A PIE. 
Please explain any of these with a real time example.

Four pillars of OOPS

Abstraction
-------------
showing relevant things
Abstraction is a process of hiding implementation details and exposes only the functionality to the user.
 In abstraction, we deal with ideas and not events. 
This means the user will only know “what it does” rather than “how it does”.
By using abstract class
Real time example 
1. Applying brakes
2. Switching on our laptop/computer system
-- in java , we implement abstractingby interfaces and abstract classes (details in week2)

Encapsulation
---------------
Hiding the irrelavent things
Encapsulation is the process of wrapping code and data together into a single unit.
In order to achieve encapsulation in java follow certain steps as proposed below:

Declare the variables as private
Declare the setters and getters to set and get the variable values
Real time : school bag




Polymorphism
----------------
Many forms
Polymorphism is the ability to perform many things in many ways. The word Polymorphism is from two different Greek words- poly and morphs. “Poly” means many, and “Morphs” means forms. So polymorphism means many forms. 
The polymorphism can be present in the case of inheritance also. The functions behave differently based on the actual implementation.

Real-life Example:

1) A delivery person delivers items to the user. If it’s a postman he will deliver the letters. If it’s a food delivery boy he will deliver the foods to the user. Like this polymorphism implemented different ways for the delivery function.

2) Mobile phones


In java - overloading and overriding



Inheritance
------------
Inheritance is the process of one class inheriting properties and methods from another class in Java. Inheritance is used when we have is-a relationship between objects.  Inheritance in Java is implemented using extends keyword.

is -a relationship

Real-life Example:

The planet Earth and Mars inherits the super class Solar System and Solar system inherits the Milky Way Galaxy. So Milky Way Galaxy is the top super class for Class Solar System, Earth and Mars.


Employee
Manager
Tea
Clerk
Customer
Laptop
Cat

not passing is -a test
Cat extends Employee	
Tea extends Laptop

is-a test


Employee extends Manager	
Clerk extends Employee
Tea extends Beverages



















































