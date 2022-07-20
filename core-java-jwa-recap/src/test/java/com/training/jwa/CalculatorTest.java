package com.training.jwa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
	
	@Test
	@DisplayName("2. Adding two whole numbers ")
	@Order(2)
	void testAddNumbers1() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(10,10);
		assertEquals(expected, actual);	
	}
	@Test
	@DisplayName("1. Adding two whole numbers that are not equal ")
	@Order(1)
	void testAddNumbers2() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(3,17);
		assertEquals(expected, actual);	
	}
	@Test
	@DisplayName("3. Adding one whole number and one negative number  ")
	@Order(3)
	void testAddNumbers3() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(40,-20);
		assertEquals(expected, actual);	
	}
}
