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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-search-submit-button21\"]")));
		//hands on 
		//locate the search button and click on that, so that search result gets displayed
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}
