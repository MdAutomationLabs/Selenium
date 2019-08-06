package how.read.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		// how to read the properties answer is next three line
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Md Ahmed\\eclipse-workspace\\SeleniumSessions\\src\\how\\read\\properties\\config.properties");
          prop.load(ip);
          
          // all the value and key available in the form of string in config file 
          System.out.println(prop.getProperty("browser")); 
          String browserName = prop.getProperty("browser");
        		  if(browserName.equals("Firefox")) {
        			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
        		      driver = new FirefoxDriver();
        		  }
        		      else if(browserName.equals("chrome")){
        		    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
        		  		  driver = new ChromeDriver(); //launch chrome driver
        		
        		  }
        		      else if(browserName.equals("IE")){
        		    	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
            		      driver = new FirefoxDriver();
	            }else {
	            	System.out.println("no browser value is given");
	            }
        		  driver.get(prop.getProperty("url"));
        		  
        		  driver.findElement(By.className(prop.getProperty("freecrm_logoimage_classname"))).isDisplayed();
        		  
        		  driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));   
        		  driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));   
        		  driver.findElement(By.xpath(prop.getProperty("loginBtn_xpath"))).click();
	}
}
