package stepByStep;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Ahmed\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		WebDriver  driver = new ChromeDriver(); //launch chrome driver
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click(); // click on go btn
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert();
		Alert alert = driver.switchTo().alert(); 
		System.out.println(alert.getText());
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct");
		}else {
			System.out.println("Incorrect");
		}
		
			
		alert.accept(); // click on ok
		
//		alert.dismiss(); // for cancel
		
		//driver.quit();
				

	}

}