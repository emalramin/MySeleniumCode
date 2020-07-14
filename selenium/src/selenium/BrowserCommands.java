package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//deleteallcookies
		driver.manage().deleteAllCookies();
		
		//Difference?
		//driver.get -- get use to website address
		//driver.navigate.to -- get us to website address
		
		//
		driver.get("http://tek-school.com/");
		//wait for 5 sec and then navigate to test environment
		Thread.sleep(5000);
		driver.navigate().to("http://tek-school.com/retail/\"");
		//go back to previous website
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		//go back to next website
		driver.navigate().forward();
		Thread.sleep(5000);
	}

}
