package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	
	
	static WebDriver driver = null;
	
	public static void initilizeBrowser(String browserName)
	
	{
	
					
		if(browserName.equals("chrome"))
		{
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("--remote-allow-origins=*");
//			driver = new ChromeDriver(co);
			
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("enable-automation");
//			co.addArguments("--headless");
//			co.addArguments("--window-size=1920,1080");
//			co.addArguments("--no-sandbox");
//			co.addArguments("--disable-extensions");
//			co.addArguments("--dns-prefetch-disable");
//			co.addArguments("--disable-gpu");
//			driver = new ChromeDriver(co);
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.kadia\\Documents\\automation\\jeproject\\chromedriver-win64\\chromedriver.exe");
//			 ChromeOptions co = new ChromeOptions();
//			 co.addArguments("enable-automation");
//				co.addArguments("--headless");
//				co.addArguments("--window-size=1920,1080");
//				co.addArguments("--no-sandbox");
//				co.addArguments("--disable-extensions");
//				co.addArguments("--dns-prefetch-disable");
//				co.addArguments("--disable-gpu");
//		       
//		        // Initialize WebDriver
		     driver = new ChromeDriver();
		}
		else 
		{
		
		 driver = new FirefoxDriver();
			//WebDriver driver = new RemoteWebDriver(new URL(SelenoidIP/wd/hub), firefoxOptions);
		}
		
		
	}
	
	
	
	public static WebDriver getDriver()
	{
		
	return driver;
	}
	

}
