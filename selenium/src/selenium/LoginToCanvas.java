package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class LoginToCanvas {

	public static void main(String[] args) {
		
		
		//1. set system property for chrome browser
		//open canvas page 
		//set implicit wait for 30 seconds
		//maximize browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://learn.canvas.net/login/canvas");
		obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj.manage().window().maximize();
		
		WebElement email = obj.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = obj.findElement(By.id("pseudonym_session_password"));
		WebElement login = obj.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		
		email.sendKeys("student@tekschool.us");
		password.sendKeys("i am not sharing my password");
		login.click();
		
		
		
		
		
		

	}

}
