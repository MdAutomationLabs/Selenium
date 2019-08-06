package stepByStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcepts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver(); //launch chrome driver
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://spicejet.com/");
        Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
		
		
		driver.findElement(By.linkText("Fleet")).click();
		
		//a[contains(text(),'Sales')]
	}
	

}
