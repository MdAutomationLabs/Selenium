package stepByStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver(); //launch chrome driver
		
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32");
		
		//driver.findElement(By.id("submit")).click();
		
	}

}
