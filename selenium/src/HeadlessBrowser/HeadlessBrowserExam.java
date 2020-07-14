package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserExam {

	public static void main(String[] args) {
		
        // Creating a new instance of the HTML unit driver
        WebDriver driver = new HtmlUnitDriver();
         
		// Navigate to Google		
        driver.get("http://www.google.com");					

		// Locate the searchbox using its name		
        WebElement element = driver.findElement(By.name("q"));	
        
       // Enter a search query		
       element.sendKeys("facebook");	
      
       // Submit the query. Webdriver searches for the form using the text input element automatically		
       // No need to locate/find the submit button		
       element.submit();			
       
       // This code will print the page title		
       System.out.println("Page title is: " + driver.getTitle());		
       
       driver.quit();	
       
}		
}

//What Is Headless Browser?
//A headless browser is a web-browser without a graphical user interface. This program will behave 
//just like a browser but will not show any GUI.
//
//Some of the examples of Headless Drivers include
//
//HtmlUnit
//Ghost
//PhantomJS
//ZombieJS
//Watir-webdriver
//In this tutorial we will focus on HtmlUnit and PhatomJS
//
//HTMLUnitDriver
//HTML UnitDriver is the most light weight and fastest implementation headless browser for of WebDriver. 
//It is based on HtmlUnit. It is known as Headless Browser Driver. It is same as Chrome, IE, or FireFox 
//driver, but it does not have GUI so one cannot see the test execution on screen.
//
//Features of HTML unit driver
//
//Support for the HTTPS and HTTP protocols
//Support for HTML responses ( clicking links, submitting forms, walking the DOM model of the HTML document etc.)
//Support for cookies
//Proxy server support
//Support for basic and NTLM authentication
//Excellent JavaScript support
//Support for submit methods GET and POST
//Ability to customize the request headers being sent to the server
//Ability to determine whether failing responses from the server should throw exceptions or should be returned 
//as pages of the appropriate type
//Steps to Use HTMLUnit Driver with Selenium
//Step 1) In Eclipse, copy the following code. Add the standard selenium library files to the project. 
//No additional jar files are required.




