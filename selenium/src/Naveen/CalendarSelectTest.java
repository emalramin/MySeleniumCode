package Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) {

		// ****************practice more***************//

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ui.freecrm.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("ard.cssp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("EMALkhan@25");

		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();

		String date1 = "18-September-2020";
		String dateArr[] = date1.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.xpath("//span[contains(text(),'September 2020')]")));
		select.deselectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.xpath("//div[@class='rbc-date-cell rbc-current']")));
		select1.selectByVisibleText(year);

		String beforeXpath = "";
		String afterXpath = "";

		final int totalWeekDays = 7;
		boolean flag = false;

		for (int rowNum = 1; rowNum <= 5; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {

				String dayVal = driver.findElement(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]"))
						.getText();
				System.out.println(dayVal);
				if (dayVal.equals(30)) {
					driver.findElements(By.xpath(beforeXpath + rowNum + afterXpath + colNum + "]"));
					((WebElement) driver).click();
					flag = true;
					break;
				}
			}

			if (flag) {
				break;
			}

		}
	}

}
