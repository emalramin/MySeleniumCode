package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		//What is Action Class? 
		//Did I mention Action Class, actually it is not a class but an Interface.

		//It is only used to represent the single user interaction to perform the 
		//series of action items build by Actions class.

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.get("https://jqueryui.com/droppable/");
		
		obj.switchTo().frame(0);
		
		Actions action = new Actions(obj); 
		Thread.sleep(4000);
		action.clickAndHold(obj.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(obj.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		
		Thread.sleep(3000);
		
		obj.quit();
	}

}
