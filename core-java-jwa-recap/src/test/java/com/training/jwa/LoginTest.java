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
