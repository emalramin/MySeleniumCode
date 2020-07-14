package AuthenticationPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//passing username and password in url to bypass Authentication popup
		//Syntax
			//url = http://the-internet.herokuapp.com/basic_auth
			//http://username:password@the-internet.herokuapp.com/basic_auth
		
		String username = "admin";
		String password = "admin";
		
		String url = "http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		
		System.out.println(url);
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
