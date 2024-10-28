package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import driverConnection.DriverConnect;


public class UserJourey extends DriverConnect{
	
	
	public static void typing() throws Exception {
		DriverConnect.openChrome();
		driver1 = DriverConnect.getDriver();
		
		driver1.findElement(pagesXpath.Xpath.typingfield).sendKeys("Standup meeting ");	
	}
	
}
