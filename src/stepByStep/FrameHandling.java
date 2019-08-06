package stepByStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver(); //launch chrome driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.name("username")).sendKeys("almirahmed");
		driver.findElement(By.name("password")).sendKeys("ahmed@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        
       
	}
	

}
