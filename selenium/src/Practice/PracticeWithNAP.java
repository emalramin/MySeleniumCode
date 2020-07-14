package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeWithNAP {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.manage().deleteAllCookies();
		
//		WebElement name = obj.findElement(By.id("u_0_q"));
//		name.sendKeys("TekSchool");
		
		Select password = new Select(obj.findElement(By.xpath("//select[@id='day']")));
		password.selectByIndex(20);
	
	
		
		
		
	}

}
