package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openChrome (String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
	      WebDriver driver = new ChromeDriver();
	      driver.get("url");
	      driver.manage().window().maximize();
		return driver;
		
	      
	      
	
	
	
	
	}
	

}
