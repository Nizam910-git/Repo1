package tech;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	Thread.sleep(1000);
	a.dismiss();
	System.out.println(text);
	driver.quit();	
	}
}
