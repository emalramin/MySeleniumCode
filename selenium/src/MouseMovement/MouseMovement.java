package MouseMovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.techlistic.com/p/selenium-practice-form.html");
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.get("https://www.spicejet.com/");
		//mouse movement is done by action class
		Actions action = new Actions(obj);
		
		//when ever we are using action classes, we use .build().perform();	
		//this will move the mouse
		
		action.moveToElement(obj.findElement(By.linkText("ADD-ONS"))).build().perform();		
		Thread.sleep(3000);
		obj.findElement(By.linkText("SpiceMax")).click();
		
		Thread.sleep(3000);
		
		obj.quit();
		
	}

}
