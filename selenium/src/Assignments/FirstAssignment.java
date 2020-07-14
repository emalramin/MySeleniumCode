package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {
	

	public static void main(String[] args) throws InterruptedException {

//		URL: http://tek-school.com/retail/ (Links to an external site.)
//
//			username:  sdet@tekschool.com
//			password: Welcome1
//			Browser: Chrome 
//			Maximize browser 
//			set pageload timeout
//			set implicit wait 
//			Steps to automate :
//			1. Open Test environment  
//			2. Click on My Account 
//			3. Click on Login
//			4. Enter user name 
//			5. Enter Password 
//			6. click on Login button
			
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		myAccount.click();
		WebElement login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("sdet@tekschool.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Welcome1");
		WebElement clickLogin = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		clickLogin.click();

}
}