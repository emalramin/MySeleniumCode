package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassTek {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.manage().deleteAllCookies();
		obj.get("http://tek-school.com/retail/");
		
		Actions action = new Actions(obj);
		action.moveToElement(obj.findElement(By.linkText("Components"))).build().perform();		
		Thread.sleep(2000);
		obj.findElement(By.linkText("img-responsive")).click();
		
		
	}

}
