package IsDisplaedIsEnabled;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		WebElement myAccount = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		myAccount.click();
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
		
		boolean b1 = driver.findElement(By.name("newsletter")).isSelected();
		System.out.println("is YES button selected?"+ " " +b1);
		
		WebElement clickYes = driver.findElement(By.name("newsletter"));
		clickYes.click();
		boolean b2 = driver.findElement(By.name("newsletter")).isSelected();
		System.out.println("is YES button selected?"+ " " +b2);
		
		boolean b3 = driver.findElement(By.xpath("//b[contains(text(),'Privacy Policy')]")).isDisplayed();
		System.out.println("is Privacy Policy displayed?"+ " " +b3); 

		boolean b4 = driver.findElement(By.xpath("//input[@class='btn btn-primary']")).isEnabled();
		System.out.println("is Continue button enabled?"+ " " +b4);
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
