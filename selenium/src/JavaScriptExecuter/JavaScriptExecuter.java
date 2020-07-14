package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExecuter {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nazimapopal@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("OPENfreez25");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		

		//executeScript is used to execute JavaScript code
		//****************************************************//
		
		//flash or highlight a specific element
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='u_0_2']"));
		flash(loginBtn, driver); 
		//drawborder
		drawBorder(loginBtn, driver);
		//take screenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\element.png\\"));
		//generateAlert
		generateAlert(driver, "There is an issue with login button on login page");
		//click on any element by using JS executor
		clickElementByJS(loginBtn, driver);
		//refresh the page
		//1.using selenium
		driver.navigate().refresh();
		//2. Javascript -- see method below
		refreshBrowserByJS(driver);
		//get the title of the page by JS
		System.out.println(getTitleByJS(driver));
		//get the page text
		System.out.println(getpageInnerText(driver));
		//page scroll down or scroll up
		scrollPageDown(driver);
		//
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Local')]"));
		scrollIntoView(forgotPwdLink, driver);
		
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i = 0; i < 100; i++) {
			changeColor("rgb(0,10,0)", element,driver); //1 change to this color
			changeColor(bgcolor, element, driver); //2 then change to this color
	
			}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");	
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title,"). toString();
		return title;
	}
	
	public static String getpageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
}



