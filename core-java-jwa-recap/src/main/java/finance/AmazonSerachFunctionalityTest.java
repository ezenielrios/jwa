package finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

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
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		
		
		//hands on 
		//locate the search button and click on that, so that search result gets displayed
	}
}
