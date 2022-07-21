package com.training.jwa;

public class Calculator {

	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	public int addNumbers(int...num)	//... varargs in java 	//it will take multiple numbvers are return tyhe sum,
	{
		int sum=0;
		for(int i:num) {
			sum += i;
		}
		return sum;
	}
	
	public boolean checkPalindrome(String word) {
		String reverseStr = "";

		int strLength = word.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + word.charAt(i);
		}
		if (word.toLowerCase().equals(reverseStr.toLowerCase()))
		{
			return true;
		} else {
			return false;
		}
	}
}
