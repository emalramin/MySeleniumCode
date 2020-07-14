package JavaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtility {

	// JavaScriptExecutor is an Interface that helps to execute JavaScript through
	// Selenium Webdriver. JavaScriptExecutor provides two methods "executescript" &
	// "executeAsyncScript"
	// to run javascript on the selected window or current page

	// Static methods

	// ScrollPageDown using javaScript Executer

	public static void scrollPageDownWithJS(WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// click on element using JSExeutor

	public static void clickElementWithJS(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	// sendKeys using JSExecutor
	// we can use SendKeys with JSExecutor if WebElement has either one of ID, Name,
	// or Class attributes

	public static void sendKeysWithJS(WebDriver driver, String element, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");

	}

	// how to select calendar date using JS Executor

	public static void selectCalendarDateWithJS(WebDriver driver, String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);

	}

	
	
	
	
	
	
	
	
	
	
	
}
