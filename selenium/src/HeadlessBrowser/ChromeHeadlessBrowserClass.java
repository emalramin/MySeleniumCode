package HeadlessBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessBrowserClass {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver obj = new ChromeDriver(options);
		obj.get("https://learn.canvas.net/login/canvas");
		System.out.println(obj.getTitle());
		
		obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj.manage().window().maximize();
		
		WebElement email = obj.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = obj.findElement(By.id("pseudonym_session_password"));
		WebElement login = obj.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		
		email.sendKeys("student@tekschool.us");
		password.sendKeys("i am not sharing my password");
		login.click();
		
	}

}
