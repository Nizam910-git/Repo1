package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement monthListBox = driver.findElement(By.id("month"));
	Select s=new Select(monthListBox);
	Thread.sleep(1000);
	s.selectByIndex(9);
	Thread.sleep(1000);
	s.deselectByIndex(9);
	
	}
}
