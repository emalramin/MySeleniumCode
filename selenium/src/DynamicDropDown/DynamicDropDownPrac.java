package DynamicDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import JavaScriptExecuter.JSUtility;

public class DynamicDropDownPrac {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
//		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
//		// click on this element
//		from.click();
		// clear the value
//		from.clear();
//		Thread.sleep(3000);
//		from.sendKeys("wash");
		// list of dynamic dropdows opens
		
//		Select oSelect = new Select (driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")));
//		oSelect.selectByIndex(1);
		
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.clear();
		from.sendKeys("WAS");
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for(WebElement city : departure) {
			if (city.getText().trim().contains("WAS"))
				JSUtility.clickElementWithJS(city, driver);
		}
		Thread.sleep(3000);
		WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.clear();
		to.sendKeys("KBL");
		List<WebElement> destination = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		for(WebElement city : destination) {
			if (city.getText().trim().contains("KBL"))
				JSUtility.clickElementWithJS(city, driver);
		}
		Thread.sleep(3000);
		WebElement numPass = driver.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numPass);
		select.selectByVisibleText("9");
		Thread.sleep(3000);
		WebElement depDate = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
		List<WebElement> departureDate = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[3]/a"));
		((Select) departureDate).getAllSelectedOptions();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
