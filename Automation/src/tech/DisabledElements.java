package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledElements {

	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sandeep/Desktop/DisabledElements.html");
		driver.findElement(By.id("d2")).sendKeys("admin");
		RemoteWebDriver r=(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d').value='manager'");
	}
}
