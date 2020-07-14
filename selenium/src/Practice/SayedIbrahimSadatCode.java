package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SayedIbrahimSadatCode {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("def81885@gmail.com");
		Thread.sleep(2000);
		WebElement nextBtn1 = driver.findElement(By.xpath("//span[@class='CwaK9']"));
		nextBtn1.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("House@$123");
		Thread.sleep(2000);
		WebElement nextBtn2 = driver.findElement(By.className("CwaK9"));
		nextBtn2.click();
		Thread.sleep(2000);

	}

}
