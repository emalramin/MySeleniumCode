package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//absolute xpath: 
		//Absolute xpath uses complete path from the root element to the desire element.
		//not recommended
		//performance issues
		//not reliable
		//can be changed at any time
		
		//Relative Xpath:
		//you can simply start by referencing the element you want and go from there.
		//relative xpaths are always prefered as they are not the complete path from the root element.
		
		
		//driver.findElement(By.xpath("//input[@class='nav-input']")).sendKeys("JAVA");
		//driver.findElement(By.xpath("//input[@name='fieldautocomplete']")).sendKeys("Hard Disk");
		//driver.findElement(By.xpath("//input[contains(@class,'nav-input')]")).sendKeys("Hard Disk");
		
		//this is how we handle xpath using ID
		//driver.findElement(By.xpath("//input[contains(@class,'test_')]")).sendKeys("Hard Disk");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("test");

	}

}
