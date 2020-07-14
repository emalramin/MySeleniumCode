package SwitchMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("ard.cssp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("EMALkhan@25");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a/button")).click();
		
		
		//if there is a frame use 
		driver.switchTo().frame("frame-name");

	}

}
