package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.get("https://jqueryui.com/droppable/");
		
		WebElement search = obj.findElement( By.xpath("//input[@placeholder='Search']"));
		
		Actions actions = new Actions(obj); 
		
		actions.keyDown(search, Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(5000);
		obj.quit();

	}

}
