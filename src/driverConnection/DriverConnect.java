package driverConnection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import testCases.UserJourey;

public class DriverConnect {
public static WebDriver driver1;

	public static WebDriver getDriver() {
	return driver1;
}

public static void setDriver(WebDriver driver) {
	DriverConnect.driver1 = driver;
}

	public static void main(String[] args) throws Exception {

		openChrome();
		UserJourey.typing();
		
	}
	
	public static void openChrome() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    ChromeOptions sslHandling = new ChromeOptions();
	    sslHandling.setAcceptInsecureCerts(true);
	    sslHandling.addArguments("--ignore-certificate-errors");
	    sslHandling.addArguments("--allow-insecure-localhost");
	    sslHandling.addArguments("--remote-allow-origins=*");  // Fixes potential cross-origin WebSocket errors
        sslHandling.addArguments("--remote-debugging-port=9222");
	    
        
	    WebDriver driver = new ChromeDriver(sslHandling);
		driver.get("https://todomvc.com/examples/react/dist/");
		driver.manage().window().maximize();
		DriverConnect.driver1=driver;
		//Thread.sleep(10000);
		//driver.close();	
	
		
	}

}
