package selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.ie.driver", "C:\\WebDrivers\\IEDriverServer.exe");
		//WebDriver driver= new EdgeDriver();
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.google.com/");
		
		try {
			driver.get("https://www.google.com//");
		} catch (SessionNotCreatedException e) {
			
		}
		
		
		//store website title in a string and string name is title.
		//method to get website title is .getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.quit();

	}

}
