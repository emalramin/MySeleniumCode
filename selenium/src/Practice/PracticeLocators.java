package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement username = driver.findElement(By.cssSelector("#email"));
		username.sendKeys("emalramin");
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		password.sendKeys("emalramin");
		//WebElement login = driver.findElement(By.cssSelector("#u_0_b")).sendKeys(login.enter);
		WebElement login = driver.findElement(By.cssSelector("#u_0_b"));
		login.sendKeys(Keys.ENTER);
		
	}

}
