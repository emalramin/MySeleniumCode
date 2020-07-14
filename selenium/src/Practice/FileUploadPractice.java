package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://xndev.com/display-image/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement findfile = driver.findElement(By.xpath("//div[@class='entry-content clearfix']//input"));

		Thread.sleep(3000);

		findfile.sendKeys("C:\\Users\\ardcs\\OneDrive\\Documents\\Arif SIV Case Expedit Letter.docx");

		Thread.sleep(5000);

		driver.quit();

	}

}
