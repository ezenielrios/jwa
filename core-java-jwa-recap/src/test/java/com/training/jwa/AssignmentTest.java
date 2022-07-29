package com.training.jwa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssignmentTest {

	Assignment assignment = new Assignment();
	
	@Test
	void testFindLargestNumber() {
		int expected = 130;
		int actual = assignment.findLargestNumber(130, 20, 30);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFindLargestNumber2() {
		int expected = 30;
		int actual = assignment.findLargestNumber(2, 30, 13);
		assertEquals(expected, actual);
	}
	@Test
	void testFindLargestNumber3() {
		int expected = 30;
		int actual = assignment.findLargestNumber(30, 3, 22);
		assertEquals(expected, actual);
	}
}
