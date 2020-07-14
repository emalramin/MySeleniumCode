package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {

		//Select Class in Selenium
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("https://www.facebook.com/");
		obj.manage().window().maximize();
		obj.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//selectByVisibleTest
		Select select1 = new Select(obj.findElement(By.xpath("//select[@id='month']")));
		select1.selectByVisibleText("Jul");
		
		//SelectByIndex
		Select select2 = new Select(obj.findElement(By.xpath("//select[@id='day']")));
		select2.selectByIndex(4);
		
		//selectByValue
		Select select3 = new Select(obj.findElement(By.xpath("//select[@id='year']")));
		select3.selectByValue("2018");
		
		//getOptions
		Select select4 = new Select(obj.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> elementCount = select4.getOptions();
		System.out.println(elementCount.size());
		
		//Print all the Options
		//Code - To get the Count of the total elements inside SELECT and to print the
		//the text value of every element present in the SELECT
		
		int iSize = elementCount.size();
		for(int i = 0; i <iSize; i++) {
			String sValue = elementCount.get(i).getText();
			System.out.println(sValue);
		}
		
		//All of the above mehtods works on both Dropdown and Multipe select box.
		
		
		
		
		Thread.sleep(8000);
		
		obj.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
