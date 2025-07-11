package tech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseHover {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.vtiger.com/");
	WebElement target = driver.findElement(By.partialLinkText("Company"));
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String phNo = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
	System.out.println("Phone number = "+phNo);
	driver.quit();
	}
	}
