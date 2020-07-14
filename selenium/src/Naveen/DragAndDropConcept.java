package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		Thread.sleep(4000);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
				.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		

	}

}
