import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		String eTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String aTitle = "";
		aTitle = driver.getTitle();
		
		if(aTitle.contentEquals(eTitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		WebElement expWait;
		expWait = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"nav-link-accountList\"]")));
		
		expWait.click();
		Thread.sleep(4000);
		driver.close();
		
//		Explicit Wait
//		The explicit wait is used to tell the Web Driver to wait for certain conditions 
//		(Expected Conditions) or the maximum time exceeded before throwing an "ElementNotVisibleException" 
//		exception.
//
//		The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements. 
//		Explicit wait gives better options than that of an implicit wait as it will wait for dynamically 
//		loaded Ajax elements.
//
//		Once we declare explicit wait we have to use "ExpectedCondtions" or we can configure how frequently 
//		we want to check the condition using Fluent Wait. These days while implementing we are using 
//		Thread.Sleep() generally it is not recommended to use
//
//		In the below example, we are creating reference wait for "WebDriverWait" class and instantiating 
//		using "WebDriver" reference, and we are giving a maximum time frame of 20 seconds.
//
//		Syntax:
//
//		WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
//		
//		In the above example, wait for the amount of time defined in the "WebDriverWait" class 
//		or the "ExpectedConditions" to occur whichever occurs first.
//
//		The above Java code states that we are waiting for an element for the time frame of 
//		20 seconds as defined in the "WebDriverWait" class on the webpage until the "ExpectedConditions" 
//		are met and the condition is "visibilityofElementLocated".
//
//		The following are the Expected Conditions that can be used in Explicit Wait
//
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()
		
	}

}
