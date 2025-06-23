package tech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DemoPageLoadTimeOUt {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try {
			driver.get("https://online.actitime.com/student21");
			System.out.println("Page is loaded within 5 seconds and pass");
		}
		catch(Exception e) {
			System.out.println("Page is not loaded within 5 seconds and fail");
		}
		driver.quit();		
	}
}
