package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.ScreenShotUtility;

public class PopupAlertPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String pagetitle;

		// handle window pop ups (webpage based popup)
		// Switch method and then alert method
		// we can either accept and alert or deny if decline option if available
		// we can print out the alert massage too
		WebElement searchBus = driver
		.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();

		// we will get text of alert and store in a string
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		Thread.sleep(5000);

		pagetitle = driver.getTitle();
		System.out.println("This is before switching windows" + pagetitle);

		WebElement crm = driver.findElement(By.xpath("//li[3]//a[1]//img[1]"));
		crm.click();

		// we get window handles when we want to switch between windows or tabs
		Set<String> WindowsHandles = driver.getWindowHandles();

		// Iterator will iterate throught the SET to get next intex
		Iterator<String> it = WindowsHandles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		pagetitle = driver.getTitle();
		System.out.println("This is after switching window" + pagetitle);

		WebElement username = driver.findElement(By.id("UserName"));
		username.sendKeys("EmalRamin");

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("EmalRamin");

		WebElement login = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[5]/div/input"));
		login.click();

		String outputPath3 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath3, "ScreenShot");

		Thread.sleep(5000);

		driver.quit();

	}

}
