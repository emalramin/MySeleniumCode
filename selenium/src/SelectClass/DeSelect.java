package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.techlistic.com/p/selenium-practice-form.html");
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select select1 = new Select(obj.findElement(By.xpath("//select[@id='selenium_commands']")));
		select1.selectByVisibleText("Browser Commands");
		select1.selectByVisibleText("Navigation Commands");
		select1.selectByVisibleText("Switch Commands");
		select1.selectByVisibleText("Wait Commands");
		select1.selectByVisibleText("WebElement Commands");
		
		Thread.sleep(5000);
		
		Select select3 = new Select(obj.findElement(By.xpath("//select[@id='selenium_commands']")));
		select3.deselectAll();
		
		//DeSelect Methods
		Select select2 = new Select(obj.findElement(By.xpath("//select[@id='selenium_commands']")));
		select2.deselectByVisibleText("Browser Commands");
		
//		deselectAll( ) : void – Clear all selected entries. This is only valid when the SELECT supports 
//		multiple selections.
//		
//		Command – oSelect.deselectAll;
//
//		deselectByIndex(int arg0) : void –Deselect the option at the given index.
//
//		Command – oSelect.deselectByIndex;
//
//		deselectByValue(String arg0) : void –Deselect all options that have a value matching the argument.
//
//		Command – oSelect.deselectByValue;
//
//		deselectByVisibleText(String arg0) : void – Deselect all options that display text matching the argument.
//
//		Command – oSelect.deselectByVisibleText
		
		Thread.sleep(5000);
		
		obj.quit();

	}

}
