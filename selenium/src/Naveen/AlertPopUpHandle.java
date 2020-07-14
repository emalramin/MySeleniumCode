package Naveen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		

		//ho to validate the correct massage
		String text = alert.getText();
		if(text.equals("please enter a valid user name")) {
			System.out.println("correct alert massg");
		}else {
			System.out.println("is-correct alert massg");
		}
		
		alert.accept(); //it will click on ok button
		
		//alert.dismiss(); //click o cancel button/or dismiss

	}

}
