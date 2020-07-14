package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ClassPractice2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.manage().deleteAllCookies();
		obj.get("http://tek-school.com/retail/");
		
		Actions action = new Actions(obj);
		action.moveToElement(obj.findElement(By.linkText("Laptops & Notebooks"))).build().perform();		
		Thread.sleep(2000);
		obj.findElement(By.linkText("Show All Laptops & Notebooks")).click();
		obj.findElement(By.id("input-sort")).click();
		obj.findElement(By.xpath("//option[contains(text(),'Name (A - Z)')]")).click();
		obj.findElement(By.id("input-limit")).click();
		obj.findElement(By.xpath("//option[contains(text(),'100')]")).click();
		
		File src = ((TakesScreenshot) obj).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\ClassPractice.png\\"));
		
		
//		Time: 25 min
//		As a: User of Tek school Test environment
//		I want to: see “ Laptops & Notebooks” section
//		So that: I can sort By : “Name(A-Z)” and Show “100”
//		Requirement Description:
//		When user navigate to Tek school Test Environment page using
//		“http://tek-school.com/retail/” website. Then user open ““ Laptops & Notebooks”  section of page and selects  “Show All Laptops & Notebooks” a page with All Laptops & Notebooks showed be displayed. User should be able to sort by Name(A-Z)  and change Show to “100”.
//		Test Data:
//		url: http://tek-school.com/retail/
//		sort By: “Name(A-Z)”
//		Show: 100
//		Browser: chrome
//		Execution report: Screenshot to show successful execution of this user Story.
	}

}
