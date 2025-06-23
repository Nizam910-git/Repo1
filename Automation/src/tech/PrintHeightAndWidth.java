package tech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement untbx = driver.findElement(By.id("email"));
	int height = untbx.getSize().getHeight();
	int width = untbx.getSize().getWidth();
	System.out.println("Height = "+height);
	System.out.println("Width = "+width);
	driver.quit();	
	}
}
