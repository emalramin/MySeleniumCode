package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.get("https://jqueryui.com/droppable/");
		
		//obj.findElement(By.xpath("//a[contains(text(),'Draggable')]"));
		
		Actions actions = new Actions(obj);
		WebElement btn1 = obj.findElement( By.xpath("//a[contains(text(),'Draggable')]"));
		
		//right click
		actions.contextClick(btn1).perform(); 
		
		//double click
		actions.doubleClick(btn1).perform();
		
		
		
		
		Thread.sleep(5000);
		obj.quit();
	}

}
