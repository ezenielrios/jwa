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
