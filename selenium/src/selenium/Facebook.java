package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement month = obj.findElement(By.id("month"));
		Select select1 = new Select(month);
		Thread.sleep(2000);
		select1.selectByVisibleText("Jul");
		
		WebElement day = obj.findElement(By.id("day"));
		Select select2 = new Select(day);
		Thread.sleep(2000);
		select2.selectByIndex(20);
		
		WebElement year = obj.findElement(By.id("year"));
		Select select3 = new Select(year);
		Thread.sleep(2000);
		select3.selectByValue("2010");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
