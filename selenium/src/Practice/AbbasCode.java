package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AbbasCode {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "http://www.londonfreelance.org/courses/frames/index.html";
		driver.get(url);
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		driver.switchTo().frame(topFrame);
		WebElement titleBar = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		System.out.println(titleBar.getText());
		titleBar.click();
		driver.switchTo().defaultContent();
		WebElement navbar = driver.findElement(By.xpath("//frame[@name='navbar']"));
		driver.switchTo().frame(navbar);
		WebElement sampleContent = driver.findElement(By.xpath("//a[text()='Sample content']"));
		System.out.println(sampleContent.getText());
		sampleContent.click();
		driver.switchTo().defaultContent();
		WebElement homePage = driver.findElement(By.xpath("//frame[@src='home.html']"));
		driver.switchTo().frame(homePage);
		scrollPageDownWithJS(driver);
		WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		System.out.println(home.getText());
		home.click();
		driver.switchTo().defaultContent();
		WebElement bot = driver.findElement(By.xpath("//frame[@src='bot.html']"));
		driver.switchTo().frame(bot);
		WebElement footer = driver.findElement(By.xpath("//h2[text()='Footer ']"));
		footer.click();
		System.out.println("Your Test Was Successfull");
		driver.close();
	}
	public static void scrollPageDownWithJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo,document.body.scrollHeight");
	}
}