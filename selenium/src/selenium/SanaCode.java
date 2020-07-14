package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SanaCode {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String siteTitle = driver.getTitle();
		System.out.println(siteTitle);
		Thread.sleep(2000);
		WebElement objwe = driver.findElement( By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		objwe.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		objwe.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		objwe = driver.findElement(By.name("email"));
		objwe.sendKeys("s2020sana@gmail.com");
		objwe = driver.findElement(By.name("password"));
		objwe.sendKeys("Sana!@#2020");
		Thread.sleep(3000);
		objwe.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		driver.close();
		driver.quit();
		
	}
}