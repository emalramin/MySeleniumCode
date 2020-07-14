package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {


		//System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//store website title in a string and string name is title.
		//method to get website title is .getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
