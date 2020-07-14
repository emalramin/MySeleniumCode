package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttachFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement findfile = driver.findElement(By.xpath("//input[@id='fileupload']"));

		Thread.sleep(3000);

		findfile.sendKeys("C:\\Users\\ardcs\\OneDrive\\Documents\\Arif SIV Case Expedit Letter.docx");

		Thread.sleep(5000);

		driver.quit();

	}

}
