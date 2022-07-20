https://revature.zoom.us/s/7841280666#success


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



Hands on - 20 minutes


Customer
	int discount =10;
	int totalBillAmount=85000;

	payBill()
		should display final bill after discount


	applyDiscount()
		
		

	main()

		



	Your final bill after 20 % discount is : 68000 USD


<pre>
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


</pre>

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



Access specifiers in java
====================

4 access specifiers


public		- least restrictive , everybody can access it
private		- most restrictive, nobody can access it	
default		- package access, only the classes in the same package can access 
protected		- package + child clasess can access 




Access Modifiers
Access modifiers are keywords which define the ability of other code to access the given entity. Modifiers can be placed on classes, interfaces, enums, and class members. The access modifiers are listed below:

Modifier	Access Level
public	Available anywhere
protected	Within the same package, and this class' sub-classes
default	Within the same package
private	Only within the same class
The default access level requires additional clarification - this access level is "default" because there is no keyword to be used. This access level is also known as "package private".

Using private modifiers on instance variables - along with public getter and setter methods - helps with encapsulation, which is one of the pillars of object-oriented programming.


non access modifiers in java 
=====================

static, final, abstract 


Variables scopes in java
==================

4 types

local
instance
class/global
block 


When a variable is declared in a Java program, it is attached to a specific scope within the program, which determines where the variable resides. The different scopes of a variable in Java are:

Instance, or object, scope
Class, or static, scope
Method scope
Block scope

Instance scope means that the variable is attached to individual objects created from the class. When an instance-scoped variable is modified, it has no effect on other, distinct objects of the same class.

Class scoped variables reside on the class definition itself. This means that when objects update a class-scoped variable, the change is reflected across all instances of the class. Class scope is declared with the static keyword. Methods can also be declared as class scope. However, static methods cannot invoke instance methods or variables (think about it: which specific object would they reference?). Static methods and variables should be referenced through the class directly, not through an object. For example: MyClass.myStaticMethod() or MyClass.myStaticVariable.

Method scope is the scope of a variable declared within a method block, whether static or instance. Method-scoped variables are only available within the method they are declared; they do not exist after the method finishes execution (the stack frame is popped from the stack and removed from memory after execution).

Block scoped variables only exist within the specific control flow block, of which there are several in Java: for, while, and do-while loops, if/else-if/else blocks, switch cases, or even just regular blocks of code declared via curly braces ({}). After the block ends, variables declared within it are no longer available.


<pre>

package com.training.jwa;

public class ScopeVariableDemo {

	int num1=100;		//instance scope
	static int maxAge = 120;	//class/global scope
	public void display1() 
	{
		int num2 = 200;		//local/method scope
		
		for(int i=1;i<=3;i++) {	//block scope
			System.out.println(i); //1,2,3
		}
		
	}
	public void display2()
	{
		num1=10;
		
	}
	public static void main(String[] args)
	{
		int result =299;		//local scope
		
	}
}

</pre>


Constructors in java
===================

is a special method which will have same name as the class name
it does not have any return type. not even void
which will gets called automatically whenever you create an object
it is used to initialize instance variables


<pre>

package com.training.jwa;
/*
 * Constructors in java
===================

is a special method which will have same name as the class name
it does not have any return type. not even void
it will gets called automatically whenever you create an object
it is used to initialize instance/member variables
 */
public class Customer {
	
	int discount = 25;
	int totalBillAmount = 100000;
	

	public Customer() {		//default constructor
		System.out.println("Constructor called");
		totalBillAmount = 100;
		discount = 25;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void payBill() {
		int amount= applyDiscount();
		System.out.println("Your final bill after discount is : " + amount);
	}

	public int applyDiscount() {
		System.out.println("should apply the discount of " + discount + "% in final amount");
		System.out.println("Applying " + discount + "%"); // Applying 20%
		//local variable
		int finalBillAmount = totalBillAmount - ( (totalBillAmount /100) * discount);
		return finalBillAmount;
	}

	public static void main(String[] args) {
		System.out.println("Customer 1");
		Customer c1 = new Customer();
		c1.payBill();
		
		
		System.out.println("\nCustomer 2");
		Customer c2 = new Customer();
		c2.payBill();
	}
}


</pre>


JUnit
------------------------

TDD
When developing software, it is important to ensure that most if not all of the code being written is tested to verify the functionality of the code. One way to ensure this is to follow a process called test-driven development, or TDD.

TDD Process
The TDD process consists of writing unit tests first, before the application code has been written. Then, code can be written to make the test pass and the process can be completed for each piece of functionality required. Thus, the process is:

Write a unit test
Run the test => test will fail

Fix the test by writing application code
Retest until the test passes
Repeat
Following the TDD process can be useful for ensuring that a valid unit tests always exists for any class or method that is written. Later, when refactoring code, the unit tests give us confidence that we can change the source code without breaking existing functionality. If we mess up somewhere, when the unit tests are run we can pinpoint exactly where the problem lies. This makes debugging much easier.

Unit Testing
Unit testing is the testing of individual software components in isolation from the rest of the system. This is done by writing unit tests which execute the code we want to inspect. When the code under test deviates from an expected outcome or behavior, the test will fail. If a test passes, it means the application performs as expected (unless there is a problem with the test itself). In Java, the most common unit testing framework is called JUnit.



-- Junit
	
- a framework used to write unit test framework
- it has lot of annotations like @Test,@Before,@After,@BeforeEach,@AfterEach and many more 

What is JUnit ?
	- open source java unit test framework
	- junit5 is known as Jupiter
	You need JDK1.8 for jupiter
	** Compiler to JDK 1.8 


@Test

Use case : We want to create a method to add two numbers 

expected
actual

<pre>
package com.training.jwa;

public class Calculator {

	public int addNumbers(int i, int j) {
		return i+j;
	}

}




package com.training.jwa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	
	@Test
	void testAddNumbers1() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(10,10);
		assertEquals(expected, actual);	
	}
	
	@Test
	void testAddNumbers2() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(3,17);
		assertEquals(expected, actual);	
	}
}

</pre>


============================================================================

Day2 Notes


JUnit Testing - More
Selenium 

@Test

@DisplayName
@Order
@MethodOrderer


Why do we want to order the tests?

How you order the tests in junit ? 

@Order annotation

@Test - declares a method as a test method
	@BeforeClass - declares a setup method that runs once, before all other methods in the class
@Before - declares a setup method that runs before each test method
@After - declares a tear-down method that runs after each test method
	@AfterClass - declares a tear-down method that runs once, after all other methods in the class



multiply (int num1,int num2)
{
	return num1*num2;
}


Test this method now 

Selenium

What is selenium ?
==========================
Selenium is an open-source tool that automates web browsers.
Selenium is an open source project for web browser automation.
 This means that Selenium consists of software that can control a web browser and perform actions like any human user could - for example, navigating to a website, clicking buttons, and filling out forms.
Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation


*** What is selenium web driver ?
Selenium WebDriver is the core of Selenium which provides an API in many different languages for programmers to write code to manipulate the browser.


Use case : I want the selenium to open the chrome browser and visit google.com
package com.training.jwa;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		System.setProperty
		("webdriver.chrome.driver","C:\\Users\\tufai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}


*** What is the use of WebDriverManager in selenium ?


WebDriverManager - which helps to setup the drivers of different browsers without downloading them manually.

WebDriverManager is an open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.) in a fully automated manner. 




Use case : I want the selenium to open the chrome browser or edge browser and visit google.com

I can use webdrivermanager from bonigracia to avoid 



Use case :: I want to test amazon search functionality

a) Setup the driver and open the browser
b) Navigate to amazon.in

c) maximize the browser
d) search for the textbox where to type




<input type="text" id="twotabsearchtextbox" value="ajanta designer wall clock copper" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

What is locators in selenium ?

A locator is a way to identify elements on a page. It is the argument passed to the Finding element methods.

List out some locators in selenium ?
class name	Locates elements whose class name contains the search value (compound class names are not permitted)
css selector	Locates elements matching a CSS selector
id	Locates elements whose ID attribute matches the search value
name	Locates elements whose NAME attribute matches the search value
link text	Locates anchor elements whose visible text matches the search value
partial link text	Locates anchor elements whose visible text contains the search value. If multiple elements are matching, only the first one will be selected.
tag name	Locates elements whose tag name matches the search value
xpath	Locates elements matching an XPath expression

What is xpath ?
What is XPath in Selenium?
XPath is a technique in Selenium to navigate through the HTML structure of a page. 
XPath enables testers to navigate through the XML structure of any document, and this can be used on both HTML and XML documents

XPath in Selenium is an XML path used for navigation through the HTML structure of the page.
 It is a syntax or language for finding any element on a web page using XML path expression. XPath can be used for both HTML and XML documents to find the location of any element on a webpage using HTML DOM structure.


Wait in selenium
=================

Implicit : (Automatic)
The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a “No Such Element Exception”. The default setting is 0. Once we set the time, the web driver will wait for the element for that time before throwing an exception.


Implicit Wait syntax:
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);


Explicit : 
The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing “ElementNotVisibleException” exception. It is an intelligent kind of wait, but it can be applied only for specified elements. It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.

Explicit Wait syntax:
WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);


<pre>

package com.training.jwa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Use case :: I want to test amazon search functionality
 */
public class AmazonSerachFunctionalityTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		WebDriver driver = null;
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		//implicit waits in selenium
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		
		//locating text box by using xpath
		//relative	
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mouse");
		//absolute path
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("speakers");
		
		//wait for 2 minutes
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"nav-search-submit-button\"]")));
		//hands on 
		//locate the search button and click on that, so that search result gets displayed
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}


</pre>

What is JDK , JRE and JVM ? Java development kit, java runtime environment, java virtual machine
What is Java ? a strongly typed, object oriented, platform independent language
What are access modifiers in java ? default, private, public, protected
How default and protected are different ? protected is same package and child class
What are the different primitive data types that are there in Java ? int, byte, short, long, float, double, boolean and char
What are different scopes of a variables in java ? Instance, class, local, block
What is a constructor? method that shares same name as a class.
Can constructor can be overloaded?  Yes 
What is the difference between overloading and overriding ? overloading 
A mechanism of wrapping/binding of data is called Encapsulation. Is that True?? yes
Is Overriding a polymorphism concept? yes
Is Bubble Sort the simplest algorithm to Sort the elements in ascending Order? yes, quick sort 
Is following modifier concept correct? Public --> The code is accessible for only to particular classes False


What is unit testing ? Testing of each individual component of software
What is junit ? - Is an open source java testing framework. It have many annotations
What is the latest version of junit ?- JUnit 5
List out some junit annotations? @BeforeAll, @BeforeEach, @AfterAll, @AfterEach, @Test, @DisplayName, @Order
List out some junit assert methods ? AssertEqual, AssertNotEqual, AssertThrows

What is selenium? an open source tool for automating web browsers, used for testing
What is web driver ? Core of selenium, provides an api in different languages for programmers to write code and manipulate the browser
What is web driver manager ? A framework that lets us use different web drivers without needing to download each one individually
What is xpath?- Is a syntax used to locate an element in a web application
What are locators in selenium ?- ID, xpath, className, CSS selector, partial link
What is the difference between implicit and explicit wait in selenium ? implicit wait is waiting for a period while explicit wait is for a specific element
Is default wait time of Implicit wait in Selenium 0? yes
Selenium can test both Web and Desktop Applications. Is the statement correct? No it is a tool for testing web application
		The simple answer is no. Selenium is designed to automate web applications, not desktop applications.







QC will be assigned at the end of the second week which is 7/27 & 7/28



Day3
=====================================================
BDD
Cucumber
POM - selenium
Page Factory
Glue code
Gherkin
Gherkin keywords

Testing 
features


BDD :
BDD framework i.e. Behavior Driven Development is a software development approach that allows the tester/business analyst to create test cases in simple text language (English).



when i visit google.com
then i type mobile
then it should give the search results

Cucumber – A BDD Framework Tool
Cucumber is a Behavior Driven Development (BDD) framework tool to write test cases.

** Cucumber uses Gherkin language ( its like simple language with some keywords )

 its like simple language with some keywords


THEN
WHEN
SCENARIO
SCENARIO OUTLINE
AND

Selenium : is an automation tool for functional testing of web based applications.


Use case : saucedemo.com and check whether login is successful or not with valid credentials


Feature file - where you will be writing the steps

Feature : user validation 
Scenario: check whether login is successful or not with valid credentials

Given user is an login page
When user enters username and password
And user clicks on submit button
Then  user is navigated to the home page


Glue code : a class which implements all the steps 
 The glue is a part of Cucumber options that describes the location and path of the step definition file.




Data driven testing
=====================



We can use Scenario Outline instead of Scenario for repetive tests


Scenario Outline
Examples 	- are there to provide parameters


Scenario outline is exactly similar to the scenario structure, but the only difference is the provision of multiple inputs.


Examples : are used to provide data to scenario outline

Examples keyword is used to specify values for each parameter used in the scenario. Scenario Outline keyword must always be followed by the keyword Examples



Feature: user validation

  Scenario Outline: check whether login is successful or not with valid credentials
    Given user is an login page
    When user enters <username> and <password>
    And user clicks on submit button
    Then user is navigated to the home page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | daniel          | richard      |
      | tufail          | ahmed        |



Glue Code 

package com.training.jwa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	String browserName = "chrome";
	WebDriver driver = null;
	
	@Given("user is an login page")
	public void user_is_an_login_page() {
		
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    System.out.println("step - user is an login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    System.out.println("step - user enters username and password");

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("step - user clicks on submit button");
	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("step - user is navigated to the home page");
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://www.saucedemo.com/inventory.html";
	    assertEquals(expectedURL, actualURL);

	}
	
}

----------------------------
What is background in cucumber ?

Background in Cucumber is used to define a step or series of steps that are common to all the tests in the feature file.

--------------------------

What is POM in selenium ?
Page object model

- design pattern to create repository
- a class is created for each page to identify web elements of that page
- it can also contain methods to do action on the objects
- separates test objects and test scripts

Advantages
--------------
Easy maintainence
Readability
Easier


package com.training.jwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	
	By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public boolean checkLogoutDisplayed() {
		return driver.findElement(btn_logout).isDisplayed();
	}
	public boolean checkLoginDisplayed() {
		return driver.findElement(btn_login).isDisplayed();
	}
}



----------

package com.training.jwa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	String browserName = "chrome";
	WebDriver driver = null;
	LoginPage loginPage ;
	@Given("user is an login page")
	public void user_is_an_login_page() {
		
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		loginPage = new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    System.out.println("step - user is an login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) {
	//	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
	    System.out.println("step - user enters username and password");

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("step - user clicks on submit button");
//	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	    loginPage.clickLogin();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("step - user is navigated to the home page");
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://www.saucedemo.com/inventory.html";
	    assertEquals(expectedURL, actualURL);

	}
	
}



Q&A


What is  BDD and TDD?
 Explain Cucumber shortly.
 What language is used by Cucumber?
What is meant by a feature file?
What are the various keywords that are used in Cucumber for writing a scenario?
What is the purpose of a Scenario Outline in Cucumber?
 What programming language is used by Cucumber?
 What is the purpose of the Step Definition file in Cucumber?
What are the major advantages of the Cucumber framework?
 What symbol is used for parameterization in Cucumber?
 What is the file extension for a feature file?
 Explain the purpose of keywords that are used for writing a scenario in Cucumber.

Given
When
Then
And
 Provide an example of the TestRunner class in Cucumber.
What is POM in cucumber?
What is PageFactory in cucumber?

Core Java 
------------
What is super class for all the exceptions in java ?

New features in JDK1.8

Lambdas
Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
new Date Time API()
default and static methods in interface

=======================

1)
Difference between Array and ArrayList

1)Array is a fixed length data structure whereas ArrayList is a variable length Collection class. 
2)We cannot change length of array once created in Java but ArrayList can be changed. 
3) We cannot store primitives in ArrayList, it can only store objects. But array can contain both primitives and objects in Java.

2)
Difference between Set and List
1. The List is an ordered sequence.	1. The Set is an unordered sequence.
2. List allows duplicate elements	2. Set doesn’t allow duplicate elements.
2.Multiple null elements can be stored.	3.Null element can store only once.


What is Object class in java ? List some methods of object class?
super class for all the classes in java, toString,equals,hashCode,wait, notify



Difference between Statement,PreparedStatement ?
Statement is used for executing simple SQL Statements 
PreparedStatement is used for executing dynamic and pre-compiled repetitive SQL Statements.	? represents placeholders


What is the use of CallableStatement ?
CallableStatement is used to call stored procedure




https://github.com/tufailahm/core-java-jwa-recap



























========================Types of testing and definitions==============

Testing is the process of executing a program to find errors. To make our software perform well it should be error-free. If testing is done successfully it will remove all the errors from the software. 

Principles of Testing:-
(i) All the tests should meet the customer requirements.
(ii) To make our software testing should be performed by a third party.
(iii) Exhaustive testing is not possible. As we need the optimal amount of testing based on the risk assessment of the application. 
(iv) All the tests to be conducted should be planned before implementing it 
(v) It follows the Pareto rule(80/20 rule) which states that 80% of errors come from 20% of program components. 
(vi) Start testing with small parts and extend it to large parts. 

Types of Testing:-
1. Unit Testing
It focuses on the smallest unit of software design. In this, we test an individual unit or group of interrelated units. It is often done by the programmer by using sample input and observing its corresponding outputs. 

Example:

a) In a program we are checking if the loop, method, or 
   function is working fine
b) Misunderstood or incorrect, arithmetic precedence.
c) Incorrect initialization
2. Integration Testing
The objective is to take unit-tested components and build a program structure that has been dictated by design. Integration testing is testing in which a group of components is combined to produce output. 

Integration testing is of four types: (i) Top-down (ii) Bottom-up (iii) Sandwich (iv) Big-Bang 
Example:

(a) Black Box testing:- It is used for validation. 
In this, we ignore internal working mechanisms and 
focus on what is the output?.

(b) White box testing:- It is used for verification. 
In this, we focus on internal mechanisms i.e.
how the output is achieved?
3. Regression Testing
Every time a new module is added leads to changes in the program. This type of testing makes sure that the whole component works properly even after adding components to the complete program. 
Example 

In school, record suppose we have module staff, students 
and finance combining these modules and checking if on 
integration of these modules works fine in regression testing 
4. Smoke Testing
This test is done to make sure that the software under testing is ready or stable for further testing 
It is called a smoke test as the testing of an initial pass is done to check if it did not catch the fire or smoke in the initial switch on. 
Example: 

If the project has 2 modules so before going to the module 
make sure that module 1 works properly
5. Alpha Testing
This is a type of validation testing. It is a type of acceptance testing which is done before the product is released to customers. It is typically done by QA people. 
Example: 

When software testing is performed internally within
the organization
6. Beta Testing
The beta test is conducted at one or more customer sites by the end-user of the software. This version is released for a limited number of users for testing in a real-time environment 
Example: 

When software testing is performed for the limited
number of people
7. System Testing
This software is tested such that it works fine for the different operating systems. It is covered under the black box testing technique. In this, we just focus on the required input and output without focusing on internal working. 
In this, we have security testing, recovery testing, stress testing, and performance testing 
Example: 

This includes functional as well as nonfunctional 
testing
8. Stress Testing
In this, we give unfavorable conditions to the system and check how they perform in those conditions. 
Example: 

(a) Test cases that require maximum memory or other
    resources are executed
(b) Test cases that may cause thrashing in a virtual 
    operating system
(c) Test cases that may cause excessive disk requirement
9. Performance Testing
It is designed to test the run-time performance of software within the context of an integrated system. It is used to test the speed and effectiveness of the program. It is also called load testing. In it we check, what is the performance of the system in the given load.
Example: 

Checking several processor cycles.
10. Object-Oriented Testing
This testing is a combination of various testing techniques that help to verify and validate object-oriented software. This testing is done in the following manner: 

Testing of Requirements,
Design and Analysis of Testing,
Testing of Code,
Integration testing,
System testing,
User Testing.
11. Acceptance Testing 
Acceptance testing is done by the customers to check whether the delivered products perform the  desired tasks or not, as stated in requirements. 

Software testing can be divided into two steps: 
1. Verification: it refers to the set of tasks that ensure that the software correctly implements a specific function. 

2. Validation: it refers to a different set of tasks that ensure that the software that has been built is traceable to customer requirements. 

Verification: “Are we building the product right?” 
Validation: “Are we building the right product?” 

What are different types of software testing? 

Software Testing can be broadly classified into two types: 

1. Manual Testing: Manual testing includes testing software manually, i.e., without using any automation tool or any script. In this type, the tester takes over the role of an end-user and tests the software to identify any unexpected behavior or bug. There are different stages for manual testing such as unit testing, integration testing, system testing, and user acceptance testing. 

Testers use test plans, test cases, or test scenarios to test software to ensure the completeness of testing. Manual testing also includes exploratory testing, as testers explore the software to identify errors in it. 

2. Automation Testing: Automation testing, which is also known as Test Automation, is when the tester writes scripts and uses another software to test the product. This process involves the automation of a manual process. Automation Testing is used to re-run the test scenarios quickly and repeatedly, that were performed manually in manual testing.

Apart from regression testing, automation testing is also used to test the application from a load, performance, and stress point of view. It increases the test coverage, improves accuracy, and saves time and money when compared to manual testing. 

What are the different types of Software Testing Techniques ? 

Software testing techniques can be majorly classified into two categories: 

1. Black Box Testing: The technique of testing in which the tester doesn’t have access to the source code of the software and is conducted at the software interface without any concern with the internal logical structure of the software is known as black-box testing. 

2. White-Box Testing: The technique of testing in which the tester is aware of the internal workings of the product, has access to its source code, and is conducted by making sure that all internal operations are performed according to the specifications is known as white box testing. 

Black Box Testing	White Box Testing
Internal workings of an application are not required.	Knowledge of the internal workings is a must.
Also known as closed box/data-driven testing.	Also known as clear box/structural testing.
End users, testers, and developers.	Normally done by testers and developers.
This can only be done by a trial and error method.	Data domains and internal boundaries can be better tested.
What are different levels of software testing? 

Software level testing can be majorly classified into 4 levels: 

1. Unit Testing: A level of the software testing process where individual units/components of a software/system are tested. The purpose is to validate that each unit of the software performs as designed. 

2. Integration Testing: A level of the software testing process where individual units are combined and tested as a group. The purpose of this level of testing is to expose faults in the interaction between integrated units. 

3. System Testing: A level of the software testing process where a complete, integrated system/software is tested. The purpose of this test is to evaluate the system’s compliance with the specified requirements. 

4. Acceptance Testing: A level of the software testing process where a system is tested for acceptability. The purpose of this test is to evaluate the system’s compliance with the business requirements and assess whether it is acceptable for delivery. 

software testing levels