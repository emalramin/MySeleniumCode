package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RuhullahNazimiCode {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		String url = "https://secure.tagged.com/register.html?display=login&loc=en_US";
		driver.get(url);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		WebElement joinFree = driver.findElement(By.id("show_reg_link"));
		joinFree.click();
		WebElement name = driver.findElement(By.id("display_name"));
		name.sendKeys("John");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("john.j123.j@gmail.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("JohnJ.123");
		Thread.sleep(1000);
		WebElement zipCode = driver.findElement(By.id("zipCode"));
		zipCode.sendKeys("23278");
		Thread.sleep(1000);
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='locale']")));
		select1.selectByVisibleText("Nederlands");
		
		WebElement gender = driver.findElement(By.id("male"));
		gender.click();
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='birth_month']")));
		month.selectByVisibleText("Jun");
		
		Select day = new Select(driver.findElement(By.xpath("//select[@id='birth_day']")));
		day.selectByValue("25");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='birth_year']")));
		year.selectByValue("1998");
		
		Select ethnicity = new Select(driver.findElement(By.xpath("//select[@id='ethnicity_selector']")));
		ethnicity.selectByVisibleText("Asian");
		
		RuhullahNazimiCode obj = new RuhullahNazimiCode();
		obj.selectFromDropDownMenu();
		
		Thread.sleep(5000);
		driver.close();
	}
	public static void selectFromDropDownMenu() {
		
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='reg_form']"));
		int iSize = menu.size();
		for(int i = 0; i <iSize; i++) {
			String sValue = menu.get(i).getText();
			System.out.println(sValue);
		}
				
			}



}