package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnvironmentType;
import dataProviders.ConfigFileReader;

public class WebDriverManager{
	public WebDriver driver;
	public static DriverType driverType;
	 public static EnvironmentType environmentType;
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	 ConfigFileReader configFileReader;
	
	 
	 public WebDriverManager() {

		 configFileReader = new ConfigFileReader();
		 driverType = configFileReader.getBrowser();
		 environmentType = configFileReader.getEnvironment();
	 }
	 
	 public WebDriver getDriver() {
	 if(driver == null) driver = createDriver();
	 return driver;
	 
	 }
	 
	 private WebDriver createDriver() {
	    switch (environmentType) {     
	         case LOCAL : driver = createLocalDriver();
	          break;
	         case REMOTE : driver = createRemoteDriver();
	          break;
	    }
	    return driver;
	    
	 }
	 
	 private WebDriver createRemoteDriver() {
	 throw new RuntimeException("RemoteWebDriver is not yet implemented");
	 }
	 
	 private WebDriver createLocalDriver() {
	        switch (driverType) {     
	        case FIREFOX : driver = new FirefoxDriver();
	      break;
	        case CHROME : 
	         System.setProperty(CHROME_DRIVER_PROPERTY, configFileReader.getDriverPath());
	         driver = new ChromeDriver();
	     break;
	        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
	     break;
	        }
	     driver.get(configFileReader.getApplicationUrl());
	        if(configFileReader.getBrowserWindowSize()) driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
	 return driver;
	 } 
	 
	 public void closeDriver() {
	 driver.close();
	 //driver.quit();
	 }
	

}
