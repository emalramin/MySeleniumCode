package IframeHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandlingClass {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		// webelement of Header frame
		WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		
		// switch to header iframe or frame
		driver.switchTo().frame(headerFrame);
		//driver.switchTo().frame("main");
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		
		System.out.println(header.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement bodyFrame = driver.findElement(By.xpath("//frame[@name='navbar']"));
		
		driver.switchTo().frame(bodyFrame);
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement footerFrame = driver.findElement(By.xpath("//frame[@name='bot']"));
		
		driver.switchTo().frame(footerFrame);
		
		WebElement footer = driver.findElement(By.xpath("//h2[text()='Footer ']"));
		System.out.println(footer.getText());
		
		// 12 min
		// practice
		// click on home link
		// print the footer
		
		driver.close();
	}

}
