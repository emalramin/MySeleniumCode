

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {

		//Implicit wait=> this wait is set on overall of webdriver execution
		//before throwing an exception (General)
		
		//Explicit wait=> this wait is set for specific element before webdriver 
		//throws an exception (until element is visible)
		
		//Fluent wait=> setting fluent wait to handle 
		//ElementNotVisibleException.
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		//we need to create the WebDriverWait class
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement find = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(find));
		find.click();
		
		//Explicit waits we can use for single element 
		//as: elementTobeClickble
		//as: elementTobePresent
		//as: elementTobeVisible
		//etc....
		
		//what is the difference between implicit wait and explicit wait?
			//Ans: Implicit wait applies to entire webdriver execution and webdriver will throw exception before certain time.
			//		Explicit wait applies to specific element and time sets for that element before it throws exception
		
		
		
		
		
		
		
	}

}
