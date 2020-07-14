package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	public static void main(String[] args) {
		
		//set system property for chrome
		//create obj for webdriver
		//maximize browser
		//set the pageload timeout to 30 sec
		//set timeout to 20 sec
		//delete cookies
		//opent Test Environment

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://tek-school.com/retail/");
		
		//Difference between driver.findElement and driver.findElements
		//FindElement
			//finds one element in UI
			//Returns type is WebElement
			//Execution: No SuchElementFoundExecution
		WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktops.click();
		
		//FindElements
			//finds many elements with same locator address or xpath or tag
			//Return type is ArrayList
			//if no element is found will return an emply ArrayList and does
			//not throws Exception
		//the return type for this is an arraylist
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size()); //how many links are present in this page
		
		for(int i = 0; i < allLinks.size(); i++) {
			String textOfElements = (allLinks.get(i).getText());
			System.out.println(textOfElements);
			
			if(textOfElements.equals("Desktops")) {
				allLinks.get(i).click();
				break;
			}
		}
		
		//lets take a screenshot of page we opened.
		
		String outputPath = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		
		ScreenShotUtility.screenShot(driver, outputPath, "TestEnvPic");
		
		
		
		
		
		
	}

}
