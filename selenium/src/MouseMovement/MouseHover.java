package MouseMovement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String baseURL = "http://tek-school.com/retail/";
		driver.get(baseURL);
		// what is difference between local variable and global variable?
		// Create Obj of Action Class
		Actions action = new Actions(driver);
		// Create WebElement using Xpath for Component element on UI
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		// using moveElement action method move your mouse to that element
		action.moveToElement(component).build().perform();
		Thread.sleep(5000);
		// double click on Component element
		action.doubleClick(component).build().perform();
		Thread.sleep(5000);
		// right click on Component element
		action.contextClick().build().perform();
		Thread.sleep(5000);
		// move to bottom of the page to Terms & Conditions link
		WebElement termsCondition = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		// move to on Terms & Conditions link.
		action.moveToElement(termsCondition).build().perform();
		// double click on Terms & Conditions link.
		Thread.sleep(5000);
		action.contextClick(termsCondition).build().perform();
		Thread.sleep(5000);

		// navigate to drag and drop page
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Thread.sleep(5000);
		action.dragAndDrop(source, target).build().perform();

		Thread.sleep(5000);
		driver.close();

	}

}
