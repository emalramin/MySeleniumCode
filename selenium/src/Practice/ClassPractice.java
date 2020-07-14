package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.ScreenShotUtility;

public class ClassPractice {

	public static void main(String[] args) throws InterruptedException {

//		1.  Open http://tek-school.com/hotel/ in chrome browser
//			2.  Print out the title
//			3.  Take screen shot from home page
//			4.  Click on Sign in button on top left side
//			5.  Wait for 5 sec
//			6.  Take screenshot of Sign in page
//			7.  Enter email 
//			8.  Enter password
//			9.  Click on sign in button
//			10.                    Take screenshot of failing sign in
//			11.                    Close the browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://tek-school.com/hotel/");
		String outputPath1 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath1, "TestEnvPic1");
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a"));
		signin.click();
		Thread.sleep(5000);
		String outputPath2 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath2, "TestEnvPic2");
		WebElement enteremail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		enteremail.sendKeys("emal.ramin.dawlatzai@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("EMALkhan@25");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		login.click();
		String outputPath3 = "C:\\Users\\ardcs\\eclipse-workspace\\selenium\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath3, "TestEnvPic3");
		
		driver.quit();

	}

}
