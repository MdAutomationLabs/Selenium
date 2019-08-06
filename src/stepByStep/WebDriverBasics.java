package stepByStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		   // driver = new ChromeDriver(); //launch chrome driver
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Md Ahmed\\Documents\\GreckoDriver\\geckodriver.exe");
	      driver = new FirefoxDriver(); // launch firefox
		
		driver.get("http://www.google.com");
		
     String title = driver.getTitle(); //get title
		
		System.out.println("Title is "+title);
		
		//validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in-correct title");
		}
	   
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit(); //quit the browser
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
//		driver.findElement(By.linkText("Gmail")).click();
//		driver.findElement(By.linkText("Sign in")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("test123@gmail.com");
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Google Search']")).click();
		
		
	}
	}


